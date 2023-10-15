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
        if(device.equals("Light"))
        {
            System.out.print("The switch turned on for ");
        }
        else if(device.equals("Thermostat"))
        {
            System.out.print("The switch turned on for ");
        }
        else if(device.equals("Music Player"))
        {
            System.out.print("The switch turned on. ");
            System.out.print("SUMMER PLAYLIST now playing in ");
        }
        return device + ".";
    }
    public String turnOff()
    {
        if(device.equals("Light"))
        {
            System.out.print("The switch turned off for ");
        }
        else if(device.equals("Thermostat"))
        {
            System.out.print("The switch turned off for ");
        }
        else if(device.equals("Music Player"))
        {
            System.out.print("The switch turned off. ");
            System.out.print("SUMMER PLAYLIST stopped playing in ");
        }
        return device + ".";
    }
    public String increaseTemp()
    {
        if (device.equals("Thermostat"))
        {
            temp++;
            System.out.print("Temperature is increased for ");
        }
        else if(device.equals("Light"))
        {
            System.out.print("INVALID. There is no temperature in ");
        }
        else if(device.equals("Music Player"))
        {
            System.out.print("INVALID. There is no temperature in ");
        }
        return device + ".";
    }
    public String decreaseTemp()
    {
        if (device.equals("Thermostat"))
        {
            temp--;
            System.out.print("Temperature is decreased for ");
        }
        else if(device.equals("Light"))
        {
            System.out.print("INVALID. There is no temperature in ");
        }
        else if(device.equals("Music Player"))
        {
            System.out.print("INVALID. There is no temperature in ");
        }
        return device + ".";
    }
    public String increaseVol()
    {
        if(device.equals("Music Player"))
        {
            System.out.print("Volume is increased for ");
        }
        else if(device.equals("Light"))
        {
            System.out.print("INVALID. There is no volume in ");
        }
        else if(device.equals("Thermostat"))
        {
            System.out.print("INVALID. There is no volume in ");
        }
        return device + ".";
    }
    public String decreaseVol()
    {
        if(device.equals("Music Player"))
        {
            System.out.print("Volume is decreased for ");
        }
        else if(device.equals("Light"))
        {
            System.out.print("INVALID. There is no volume in ");
        }
        else if(device.equals("Thermostat"))
        {
            System.out.print("INVALID. There is no volume in ");
        }
        return device + ".";
    }
}