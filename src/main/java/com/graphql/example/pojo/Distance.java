package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class Distance implements java.io.Serializable {

    private Double feet;
    private Double meters;

    public Distance() {
    }

    public Distance(Double feet, Double meters) {
        this.feet = feet;
        this.meters = meters;
    }

    public Double getFeet() {
        return feet;
    }
    public void setFeet(Double feet) {
        this.feet = feet;
    }

    public Double getMeters() {
        return meters;
    }
    public void setMeters(Double meters) {
        this.meters = meters;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Double feet;
        private Double meters;

        public Builder() {
        }

        public Builder setFeet(Double feet) {
            this.feet = feet;
            return this;
        }

        public Builder setMeters(Double meters) {
            this.meters = meters;
            return this;
        }


        public Distance build() {
            return new Distance(feet, meters);
        }

    }
}
