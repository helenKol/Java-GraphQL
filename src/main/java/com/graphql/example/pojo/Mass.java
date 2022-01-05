package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class Mass implements java.io.Serializable {

    private Integer kg;
    private Integer lb;

    public Mass() {
    }

    public Mass(Integer kg, Integer lb) {
        this.kg = kg;
        this.lb = lb;
    }

    public Integer getKg() {
        return kg;
    }
    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Integer getLb() {
        return lb;
    }
    public void setLb(Integer lb) {
        this.lb = lb;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer kg;
        private Integer lb;

        public Builder() {
        }

        public Builder setKg(Integer kg) {
            this.kg = kg;
            return this;
        }

        public Builder setLb(Integer lb) {
            this.lb = lb;
            return this;
        }


        public Mass build() {
            return new Mass(kg, lb);
        }

    }
}
