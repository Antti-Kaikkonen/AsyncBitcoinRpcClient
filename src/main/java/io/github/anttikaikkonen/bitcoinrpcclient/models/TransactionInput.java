package io.github.anttikaikkonen.bitcoinrpcclient.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionInput {
    
    String coinbase;
    long sequence;
    String txid;
    int vout;
    ScriptSig scriptSig;
    
}
