package io.github.anttikaikkonen.bitcoinrpcclient.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionOutput {
    
    double value;
    int n;
    ScriptPubKey scriptPubKey;
    
}