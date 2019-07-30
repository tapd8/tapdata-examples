package io.tapdata.sdk.util;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongodbUtil {

    public static MongoClient createMongoClient(String databaseUri) {

        MongoClientURI uri = new MongoClientURI(databaseUri);
        MongoClient mongoClient = new MongoClient(uri);

        return mongoClient;
    }

    public static MongoDatabase getMongodbDatabase(MongoClient mongoClient, String databaseUri) {
        MongoClientURI uri = new MongoClientURI(databaseUri);
        MongoDatabase database = mongoClient.getDatabase(uri.getDatabase());
        return database;
    }
}