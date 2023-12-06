// Фабрика для создания врагов
class EnemyFactory {
    public Enemy createEnemy(int type) {
        switch (type) {
            case 1:
                return new EnemyType1();
            case 2:
                return new EnemyType2();
            default:
                return null;
        }
    }
}
