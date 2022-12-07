public class HomeWork_6 {
    public static void main(String[] args) {

        String warrior = "воїн";
        String archer = "лучник";
        String rider = "вершник";
        //Li's army
        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int riderAttackLi = 46;
        int amountArmyLi = 860;
        int warriorPowerAttackLi = warriorAttackLi*amountArmyLi;
        int archerPowerAttackLi = archerAttackLi*amountArmyLi;
        int riderPowerAttackLi = riderAttackLi*amountArmyLi;
        int totalAttackPowerLi = warriorPowerAttackLi+archerPowerAttackLi+riderPowerAttackLi;

        System.out.println("Армія Лі (типи військ та їх потужність):");
        System.out.println("* "+warrior+": "+"сила атаки: "+warriorAttackLi+", кількість од.: "+amountArmyLi+
                ", атакуюча міць: "+warriorPowerAttackLi+";");
        System.out.println("* "+archer+": "+"сила атаки: "+archerAttackLi+", кількість од.: "+amountArmyLi+
                ", атакуюча міць: "+archerPowerAttackLi+";");
        System.out.println("* "+rider+": "+"сила атаки: "+riderAttackLi+", кількість од.: "+amountArmyLi+
                ", атакуюча міць: "+riderPowerAttackLi+";");
        System.out.println("Загальна атакуюча потужність армії Лі: "+totalAttackPowerLi);
        System.out.println("Загальна численність армії Лі: "+amountArmyLi*3+" одиниць");
        System.out.println(" ");

        // Ming's army
        int warriorAttackMing = 13;
        int archerAttackMing = 24;
        int riderAttackMing = 46;
        int amountArmyMing = (int)(amountArmyLi*1.5);
        int warriorPowerAttackMing = warriorAttackMing*amountArmyMing;
        int archerPowerAttackMing = archerAttackMing*amountArmyMing;
        int riderPowerAttackMing = riderAttackMing*amountArmyMing;
        int totalAttackPowerMing = warriorPowerAttackMing+archerPowerAttackMing+riderPowerAttackMing;

        System.out.println("Армія Мінь (типи військ та їх потужність):");
        System.out.println("* "+warrior+": "+"сила атаки: "+warriorAttackMing+", кількість од.: "+amountArmyMing+
                ", атакуюча міць: "+warriorPowerAttackMing+";");
        System.out.println("* "+archer+": "+"сила атаки: "+archerAttackMing+", кількість од.: "+amountArmyMing+
                ", атакуюча міць: "+archerPowerAttackMing+";");
        System.out.println("* "+rider+": "+"сила атаки: "+riderAttackMing+", кількість од.: "+amountArmyMing+
                ", атакуюча міць: "+riderPowerAttackMing+";");
        System.out.println("Загальна атакуюча потужність армії Мінь: "+totalAttackPowerMing);
        System.out.println("Загальна численність армії Мінь: "+amountArmyMing*3+" одиниць");




           }
}