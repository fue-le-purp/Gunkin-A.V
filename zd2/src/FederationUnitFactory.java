class FederationUnitFactory implements UnitFactory {
    @Override
    public Infantry createInfantry() {
        return new FederationInfantry();
    }

    @Override
    public Tank createTank() {
        return new FederationTank();
    }

    @Override
    public Artillery createArtillery() {
        return new FederationArtillery();
    }
}