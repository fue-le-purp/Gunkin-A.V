// Тестирование игры
public class Main {
    public static void main(String[] args) {
        // Создание фабрик для разных фракций
        UnitFactory federationFactory = new FederationUnitFactory();
        UnitFactory confederationFactory = new ConfederationUnitFactory();

        // Создание юнитов для каждой фракции
        Infantry federationInfantry = federationFactory.createInfantry();
        Tank federationTank = federationFactory.createTank();
        Artillery federationArtillery = federationFactory.createArtillery();

        Infantry confederationInfantry = confederationFactory.createInfantry();
        Tank confederationTank = confederationFactory.createTank();
        Artillery confederationArtillery = confederationFactory.createArtillery();

        // Атака юнитов
        federationInfantry.attack();
        federationTank.attack();
        federationArtillery.attack();

        confederationInfantry.attack();
        confederationTank.attack();
        confederationArtillery.attack();
    }
}