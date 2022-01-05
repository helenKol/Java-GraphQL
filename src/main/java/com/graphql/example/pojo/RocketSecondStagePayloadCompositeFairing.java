package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class RocketSecondStagePayloadCompositeFairing implements java.io.Serializable {

    private Distance diameter;
    private Distance height;

    public RocketSecondStagePayloadCompositeFairing() {
    }

    public RocketSecondStagePayloadCompositeFairing(Distance diameter, Distance height) {
        this.diameter = diameter;
        this.height = height;
    }

    public Distance getDiameter() {
        return diameter;
    }
    public void setDiameter(Distance diameter) {
        this.diameter = diameter;
    }

    public Distance getHeight() {
        return height;
    }
    public void setHeight(Distance height) {
        this.height = height;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Distance diameter;
        private Distance height;

        public Builder() {
        }

        public Builder setDiameter(Distance diameter) {
            this.diameter = diameter;
            return this;
        }

        public Builder setHeight(Distance height) {
            this.height = height;
            return this;
        }


        public RocketSecondStagePayloadCompositeFairing build() {
            return new RocketSecondStagePayloadCompositeFairing(diameter, height);
        }

    }
}
