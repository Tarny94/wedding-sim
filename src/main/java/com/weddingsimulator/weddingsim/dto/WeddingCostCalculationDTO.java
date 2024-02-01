package com.weddingsimulator.weddingsim.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WeddingCostCalculationDTO {
    private double incomeTotalGuests;
    private double incomeConfirmedGuests;
    private double totalWeddingCost;
    private double totalPayed;
    private double resultIncomeTotalGuests;
    private double resultIncomeConfirmedGuests;
    private int suppliesConfirmed;
    private int suppliesPayed;
    private int totalSupplies;
    private double remainingToBePay;
}
