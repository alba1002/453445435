
public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(200, 25, "BOOST");
        Medic medic = new Medic(150, 5, "Heal Points", 5);
        Warrior warrior = new Warrior(215, 30, "CRITICAL DAMAGE");
        Hero[] havingSuperAbility = {magic, medic, warrior};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            havingSuperAbility[i].applySuperAbility("s");
            System.out.println(havingSuperAbility[i].info());
            if(havingSuperAbility[i] == medic){
                System.out.println(medic.increaseExperience());
            }
        }
    }
}