package io.tapdata.sdk.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import io.tapdata.sdk.model.TransactionLog;
import io.tapdata.sdk.util.MapUtil;
import io.tapdata.sdk.util.MongodbUtil;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.Map;

public class TransactionLogMongoTest {

    private final static String COLLECTION_NAME = "Transaction_Log";
    private final static String GZ2_MONGODB_URI = "mongodb://admin:QHTFmmbYWKEeEVhv@106.75.162.192:27017/bank?authSource=admin";

    private static String databaseUri;
    private static MongoClient mongoClient;
    private static MongoDatabase mongoDatabase;
    private static MongoCollection<Document> collection;
    private static String id;
    private static String customerId;
    private static String shop;
    private static int limit;
    private static int skip;

    @BeforeClass
    public static void beforeClass() {
        databaseUri = StringUtils.isBlank(System.getProperty("databaseUri")) ? GZ2_MONGODB_URI : System.getProperty("databaseUri");
        mongoClient = MongodbUtil.createMongoClient(databaseUri);
        mongoDatabase = MongodbUtil.getMongodbDatabase(mongoClient, databaseUri);
        collection = mongoDatabase.getCollection(COLLECTION_NAME);

        id = System.getProperty("transaction_id") == null ? "" : System.getProperty("customer_id");
        customerId = StringUtils.isNoneBlank(System.getProperty("customer_id")) ? System.getProperty("customer_id") : "C000079948";
        shop = StringUtils.isNoneBlank(System.getProperty("shop")) ? System.getProperty("shop") : "LV";
        limit = System.getProperty("limit") == null ? 5 : Integer.parseInt(System.getProperty("limit"));
        skip = System.getProperty("skip") == null ? 0 : Integer.parseInt(System.getProperty("skip"));
    }

    @Test
    public void transactionLogV1ControllerCreateTest() throws Exception {
        TransactionLog transactionLog = new TransactionLog();
        transactionLog.setCUSTOMERID(customerId);
        transactionLog.setAMOUNT(new BigDecimal(RandomUtils.nextDouble(100, 200000)).setScale(2, BigDecimal.ROUND_HALF_UP));
        transactionLog.setBUYTIME(OffsetDateTime.now());
        transactionLog.setSHOP(shop);

        Map<String, Object> map = MapUtil.objectToMap(transactionLog, false);
        Document doc = new Document(map);
        System.out.println("====== Create Transaction_Log ======");
        System.out.println("doc: " + doc.toJson());
        System.out.println("\n");
        collection.insertOne(doc);
        id = doc.getObjectId("_id").toHexString();
    }

    @Test
    public void transactionLogV1ControllerDeleteByIdTest() {
        String id = this.id;
        if (StringUtils.isNotBlank(id)) {
            ObjectId objectId = new ObjectId(id);
            DeleteResult deleteResult = collection.deleteOne(new Document("_id", objectId));
            long deletedCount = deleteResult.getDeletedCount();
            System.out.println("====== Delete Transaction_Log by _id: " + id + " ======");
            System.out.println("delete count: " + deletedCount + "\n\n");
        }
    }

    @Test
    public void transactionLogV1ControllerFindByIdTest() {
        String id = this.id;
        if (StringUtils.isNotBlank(id)) {
            ObjectId objectId = new ObjectId(id);
            FindIterable<Document> documents = collection.find(new Document("_id", objectId));
            try (
                    MongoCursor<Document> iterator = documents.iterator()
            ) {
                while (iterator.hasNext()) {
                    Document next = iterator.next();
                    System.out.println("====== Find by id: " + id + " ======");
                    System.out.println(next.toJson() + "\n\n");
                }
            }

        }
    }

    @Test
    public void transactionLogV1ControllerFindPageTest() {
        Document find = new Document("AMOUNT", new Document("$gt", 10000));
        Document sort = new Document("AMOUNT", -1);
        FindIterable<Document> documents = collection
                .find(find)
                .sort(sort)
                .limit(limit)
                .skip(TransactionLogMongoTest.skip);

        long count = collection.countDocuments(find);
        try (
                MongoCursor<Document> iterator = documents.iterator()
        ) {
            System.out.println("====== Find page ======");
            System.out.println("where: " + find.toJson());
            System.out.println("sort: " + sort.toJson());
            System.out.println("limit: " + limit);
            System.out.println("skip: " + skip);
            System.out.println("total count: " + count);
            System.out.println("data: [");
            while (iterator.hasNext()) {
                Document next = iterator.next();
                System.out.print("  " + next.toJson());
                if (iterator.hasNext()) {
                    System.out.println(",");
                } else {
                    System.out.println();
                }
            }
            System.out.println("]\n");
        }
    }

    @Test
    public void transactionLogV1ControllerFindPageFilterFieldsTest() {
        Document find = new Document("AMOUNT", new Document("$gt", 10000));
        Document sort = new Document("AMOUNT", -1);
        Document fields = new Document("_id", 1)
                .append("CUSTOMER_ID", 1)
                .append("AMOUNT", 1);
        FindIterable<Document> documents = collection
                .find(find)
                .projection(fields)
                .sort(sort)
                .limit(limit)
                .skip(TransactionLogMongoTest.skip);

        long count = collection.countDocuments(find);

        try (
                MongoCursor<Document> iterator = documents.iterator()
        ) {
            System.out.println("====== Find page ======");
            System.out.println("where: " + find.toJson());
            System.out.println("fields: " + fields.toJson());
            System.out.println("sort: " + sort.toJson());
            System.out.println("limit: " + limit);
            System.out.println("skip: " + skip);
            System.out.println("total count: " + count);
            System.out.println("data: [");
            while (iterator.hasNext()) {
                Document next = iterator.next();
                System.out.print("  " + next.toJson());
                if (iterator.hasNext()) {
                    System.out.println(",");
                } else {
                    System.out.println();
                }
            }
            System.out.println("]\n");
        }
    }

    @Test
    public void transactionLogV1ControllerUpdateByIdTest() {
        String id = this.id;
        if (StringUtils.isNotBlank(id)) {
            Document find = new Document("_id", new ObjectId(id));
            Double newAmount = new BigDecimal(RandomUtils.nextDouble(1000, 200000)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            Document update = new Document("$set", new Document("AMOUNT", newAmount));
            UpdateResult updateResult = collection.updateOne(find, update);
            System.out.println("====== Update by id: " + id + " ======");
            System.out.println("new AMOUNT: " + newAmount);
            System.out.println("update count: " + updateResult.getModifiedCount() + "\n");
        }
    }

    @Test
    public void allTest() throws Exception {
        this.transactionLogV1ControllerCreateTest();
        this.transactionLogV1ControllerFindByIdTest();
        this.transactionLogV1ControllerUpdateByIdTest();
        this.transactionLogV1ControllerFindByIdTest();
        this.transactionLogV1ControllerFindPageTest();
    }

    @AfterClass
    public static void afterClass() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}