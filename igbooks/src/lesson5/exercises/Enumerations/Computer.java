package lesson5.exercises.Enumerations;

public class Computer
{
    PowerState state;

    public enum PowerState
    {
        OFF("Power is off"),
        ON("Power is on"),
        SUSPEND("Power usage is low");
        private String description;
        private PowerState(String desc)
        {
            this.description = desc;
        }

        public String getDescription()
        {
            return this.description;
        }
    }

    public PowerState getState()
    {
        return this.state;
    }
    public void setState(PowerState state)
    {
        this.state = state;
    }
}
