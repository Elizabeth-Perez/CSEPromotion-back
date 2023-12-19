package com.isc.cse.promotion.projections;

public interface EmailProjection {
    boolean isSend();
    String getCodeGenerated();
    
}
