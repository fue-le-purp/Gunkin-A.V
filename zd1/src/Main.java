// Тестирование игры
public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();
        Maze maze = new Maze(factory);

        // Встреча с врагом типа 1
        maze.encounterEnemy(1);

        // Встреча с врагом типа 2
        maze.encounterEnemy(2);

        // Попытка создания врага неизвестного типа
        maze.encounterEnemy(3);
    }
}