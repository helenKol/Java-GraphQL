package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class ShipLocation implements java.io.Serializable {

    private Double latitude;
    private Double longitude;

    public ShipLocation() {
    }

    public ShipLocation(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Double latitude;
        private Double longitude;

        public Builder() {
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }


        public ShipLocation build() {
            return new ShipLocation(latitude, longitude);
        }

    }
}
