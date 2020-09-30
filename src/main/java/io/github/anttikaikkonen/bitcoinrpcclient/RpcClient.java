package io.github.anttikaikkonen.bitcoinrpcclient;

import io.github.anttikaikkonen.bitcoinrpcclient.models.Block;
import io.github.anttikaikkonen.bitcoinrpcclient.models.BlockHeader;
import java.util.concurrent.CompletionStage;

public interface RpcClient {
    
    public CompletionStage<Integer> getBlockCount();

    public CompletionStage<String> getBlockHash(int height);
    
    public CompletionStage<Block> getBlock(String hash);

    public CompletionStage<BlockHeader> getBlockHeader(String fromHash);
    
    public void close();
    
}
