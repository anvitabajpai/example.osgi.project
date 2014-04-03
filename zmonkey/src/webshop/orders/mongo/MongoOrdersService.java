package webshop.orders.mongo;

import java.util.ArrayList;
import java.util.List;

import net.vz.mongodb.jackson.DBCursor;
import net.vz.mongodb.jackson.JacksonDBCollection;

import org.amdatu.mongo.MongoDBService;
import webshop.orders.api.OrderService;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

public class MongoOrdersService implements OrderService {
	private static final String COLLECTION = "orders";
	private volatile MongoDBService m_mongoDBService;
	private DBCollection ordersCollection;

	public void start() {
		//ordersCollection = m_mongoDBService.getDB().getCollection(COLLECTION);
	}
	
	public void stop() {
		//ordersCollection = null;
	}
	
	

	@Override
	public void getOrderById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listOrders() {
		// TODO Auto-generated method stub
		
	}
}
