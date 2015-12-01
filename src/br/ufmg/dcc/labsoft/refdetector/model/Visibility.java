package br.ufmg.dcc.labsoft.refdetector.model;

public enum Visibility {

    PUBLIC,
    PRIVATE,
    PROTECTED,
    PACKAGE;
    
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
    
}
