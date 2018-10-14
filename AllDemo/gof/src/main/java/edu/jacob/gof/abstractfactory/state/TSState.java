package edu.jacob.gof.abstractfactory.state;

public class TSState implements State {

        @Override
        public String getArea() {
            return "TS Area : 9,00,000";
        }

        @Override
        public String getCapital() {
            return "Hyderabad";
        }

        @Override
        public String stateHeadName() {
            return "Chandrashekhar Rao";
        }

        @Override
        public double stateBudget() {
            return 800000;
        }

    @Override
    public String stateName() {
        return "TS";
    }

}
