package fhso.dev.order_api.repository;

import fhso.dev.order_api.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  OrderRepository extends MongoRepository<OrderEntity,Long> {
}
