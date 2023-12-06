class ConfederationUnitFactory implements UnitFactory {
    @Override
    public Infantry createInfantry() {
        return new ConfederationInfantry();
    }

    @Override
    public Tank createTank() {
        return new ConfederationTank();
    }

    @Override
    public Artillery createArtillery() {
        return new ConfederationArtillery();
    }
}