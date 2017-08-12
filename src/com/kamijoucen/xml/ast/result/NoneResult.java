package com.kamijoucen.xml.ast.result;

import com.kamijoucen.xml.token.TokenLocation;

public enum NoneResult implements BaseResult {
    INSTANCE;
    @Override
    public String val() {
        return null;
    }

    @Override
    public TokenLocation getTokenLocation() {
        return null;
    }


}
