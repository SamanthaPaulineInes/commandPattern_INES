package LabHw5_INES_3BSCS1_CommandPattern;
public class Device
{
    private String device;
    private double temp = 21.0;

    public Device(String device)
    {
        this.device = device;
    }
    public String turnOn()
    {
        return device + " is turned on.";
    }
    public String turnOff()
    {
        return device + " is turned off.";
    }
    public String increaseTemp()
    {
        if (device.equals("Thermostat"))
        {
            temp++;
        }
        return device + " temperature is increased.";
    }
    public String decreaseTemp()
    {
        if (device.equals("Thermostat"))
        {
            temp--;
        }
        return device + " temperature is decreased.";
    }
    public String increaseVol()
    {
        return device + " volume is increased.";
    }
    public String decreaseVol()
    {
        return device + " volume is decreased.";
    }
    public String increaseTempVol()
    {
        return device + "There is no temperature in Music Player.";
    }
}