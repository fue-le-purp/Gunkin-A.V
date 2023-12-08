// Класс лабиринта
class Maze {
    private EnemyFactory enemyFactory;

    public Maze(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    public void encounterEnemy(int type) {
        Enemy enemy = enemyFactory.createEnemy(type);
        if (enemy != null) {
            enemy.attack();
        } else {
            System.out.println("Неизвестный тип врага!");
        }
    }
}
