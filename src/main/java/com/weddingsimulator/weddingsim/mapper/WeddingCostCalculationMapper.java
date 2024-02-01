package com.weddingsimulator.weddingsim.mapper;

import com.weddingsimulator.weddingsim.dto.WeddingCostCalculationDTO;
import com.weddingsimulator.weddingsim.model.WeddingCostCalculation;
import org.mapstruct.Mapper;

@Mapper
public class WeddingCostCalculationMapper {
    public static WeddingCostCalculationDTO toDTO(WeddingCostCalculation weddingCostCalculation) {
        WeddingCostCalculationDTO dto = new WeddingCostCalculationDTO();
        dto.setIncomeTotalGuests(weddingCostCalculation.getIncomeTotalGuests());
        dto.setIncomeConfirmedGuests(weddingCostCalculation.getIncomeConfirmedGuests());
        dto.setTotalWeddingCost(weddingCostCalculation.getTotalWeddingCost());
        dto.setTotalPayed(weddingCostCalculation.getTotalPayed());
        dto.setResultIncomeTotalGuests(weddingCostCalculation.getResultIncomeTotalGuests());
        dto.setResultIncomeConfirmedGuests(weddingCostCalculation.getResultIncomeConfirmedGuests());
        dto.setSuppliesConfirmed(weddingCostCalculation.getSuppliesConfirmed());
        dto.setSuppliesPayed(weddingCostCalculation.getSuppliesPayed());
        dto.setTotalSupplies(weddingCostCalculation.getTotalSupplies());
        dto.setRemainingToBePay(weddingCostCalculation.getRemainToBePay());
        return dto;
    }
}
