package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class LaunchTelemetry implements java.io.Serializable {

    private String flight_club;

    public LaunchTelemetry() {
    }

    public LaunchTelemetry(String flight_club) {
        this.flight_club = flight_club;
    }

    public String getFlight_club() {
        return flight_club;
    }
    public void setFlight_club(String flight_club) {
        this.flight_club = flight_club;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String flight_club;

        public Builder() {
        }

        public Builder setFlight_club(String flight_club) {
            this.flight_club = flight_club;
            return this;
        }


        public LaunchTelemetry build() {
            return new LaunchTelemetry(flight_club);
        }

    }
}
