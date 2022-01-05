package com.graphql.example.pojo;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-01-05T22:41:37+0300"
)
public class LaunchRocketFairings implements java.io.Serializable {

    private Boolean recovered;
    private Boolean recovery_attempt;
    private Boolean reused;
    private String ship;

    public LaunchRocketFairings() {
    }

    public LaunchRocketFairings(Boolean recovered, Boolean recovery_attempt, Boolean reused, String ship) {
        this.recovered = recovered;
        this.recovery_attempt = recovery_attempt;
        this.reused = reused;
        this.ship = ship;
    }

    public Boolean getRecovered() {
        return recovered;
    }
    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    public Boolean getRecovery_attempt() {
        return recovery_attempt;
    }
    public void setRecovery_attempt(Boolean recovery_attempt) {
        this.recovery_attempt = recovery_attempt;
    }

    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public String getShip() {
        return ship;
    }
    public void setShip(String ship) {
        this.ship = ship;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Boolean recovered;
        private Boolean recovery_attempt;
        private Boolean reused;
        private String ship;

        public Builder() {
        }

        public Builder setRecovered(Boolean recovered) {
            this.recovered = recovered;
            return this;
        }

        public Builder setRecovery_attempt(Boolean recovery_attempt) {
            this.recovery_attempt = recovery_attempt;
            return this;
        }

        public Builder setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }

        public Builder setShip(String ship) {
            this.ship = ship;
            return this;
        }


        public LaunchRocketFairings build() {
            return new LaunchRocketFairings(recovered, recovery_attempt, reused, ship);
        }

    }
}
