package com.weddingsimulator.weddingsim.repository;

import com.weddingsimulator.weddingsim.model.Guest;
import com.weddingsimulator.weddingsim.model.WeddingCostCalculation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeddingCostRepository extends MongoRepository<WeddingCostCalculation, String> {
}
