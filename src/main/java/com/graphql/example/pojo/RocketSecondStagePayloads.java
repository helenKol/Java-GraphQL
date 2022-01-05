package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class RocketSecondStagePayloads implements java.io.Serializable {

    private RocketSecondStagePayloadCompositeFairing composite_fairing;
    private String option_1;

    public RocketSecondStagePayloads() {
    }

    public RocketSecondStagePayloads(RocketSecondStagePayloadCompositeFairing composite_fairing, String option_1) {
        this.composite_fairing = composite_fairing;
        this.option_1 = option_1;
    }

    public RocketSecondStagePayloadCompositeFairing getComposite_fairing() {
        return composite_fairing;
    }
    public void setComposite_fairing(RocketSecondStagePayloadCompositeFairing composite_fairing) {
        this.composite_fairing = composite_fairing;
    }

    public String getOption_1() {
        return option_1;
    }
    public void setOption_1(String option_1) {
        this.option_1 = option_1;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private RocketSecondStagePayloadCompositeFairing composite_fairing;
        private String option_1;

        public Builder() {
        }

        public Builder setComposite_fairing(RocketSecondStagePayloadCompositeFairing composite_fairing) {
            this.composite_fairing = composite_fairing;
            return this;
        }

        public Builder setOption_1(String option_1) {
            this.option_1 = option_1;
            return this;
        }


        public RocketSecondStagePayloads build() {
            return new RocketSecondStagePayloads(composite_fairing, option_1);
        }

    }
}
