package LabHw5_INES_3BSCS1_CommandPattern;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main
{
    public static ArrayList<String> device = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException
    {
        System.out.print("\nWELCOME TO SMART HOME AUTOMATION");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 1 | LAB 5: COMMAND PATTERN");
        System.out.print("\n==========================================================");

        device.add("Light");
        device.add("Thermostat");
        device.add("Music Player");

        boolean a = true;

        while (a)
        {
            Scanner d = new Scanner(System.in);

            System.out.println("\n\nDevices:");
            for (String device : device)
            {
                System.out.println(device);
            }

            String devChoice = userChoseDev(d,"Please choose a device you want");
            String commChoice = userChoseDev(d,"Choose a command for " + devChoice + " from 1 to 6");

            System.out.print("\n=====");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(" Loading");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(" =====\n\n");
            TimeUnit.SECONDS.sleep(1);

            Device device = new Device(devChoice);
            App app = new App();
            exeComm(device, commChoice);

            System.out.print("\nWant to continue? Yes or No? ");
            String lttr = d.nextLine();

            if(lttr.equalsIgnoreCase("No"))
            {
                a = false;
                System.out.print("\nTHANK YOU!\n");
            }
        }
    }
    public static String userChoseDev(Scanner a, String message)
    {
        String choice = "";
        boolean validChoice = false;

        while(!validChoice)
        {
            System.out.print("\n" + message + ": ");
            choice = a.nextLine();

            if (message.contains("device"))
            {
                if (device.contains(choice))
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("No device available. Please pick another.");
                }
            }
            else if (message.contains("command"))
            {
                if (choice.matches("[1-6]"))
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("No command available. Please pick a command");
                }
            }
        }
        return choice;
    }
    public static void exeComm(Device dvc, String Choice)
    {
        switch (Choice)
        {
            case "1":
                TurnOnSwitch turnOnSwitch = new TurnOnSwitch(dvc);
                System.out.println(turnOnSwitch.execute());
                break;
            case "2":
                TurnOffSwitch turnOffSwitch = new TurnOffSwitch(dvc);
                System.out.println(turnOffSwitch.execute());
                break;
            case "3":
                IncreaseTemp increaseTemperature = new IncreaseTemp(dvc);
                System.out.println(increaseTemperature.execute());
                break;
            case "4":
                DecreaseTemp decreaseTemperature = new DecreaseTemp(dvc);
                System.out.println(decreaseTemperature.execute());
                break;
            case "5":
                IncreaseVol increaseVolume = new IncreaseVol(dvc);
                System.out.println(increaseVolume.execute());
                break;
            case "6":
                DecreaseVol decreaseVolume = new DecreaseVol(dvc);
                System.out.println(decreaseVolume.execute());
                break;
        }
    }
}