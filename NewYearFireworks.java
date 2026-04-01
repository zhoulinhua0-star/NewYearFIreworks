import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NewYearFireworks extends JPanel {

    private static final String TEXT = "新年快乐";
    private static final int FONT_SIZE = 75;

    private final Random random = new Random();
    private final List<FireworkText> fireworks = new ArrayList<>();

    public NewYearFireworks() {
        setBackground(Color.WHITE);

        // 动画刷新（60 FPS 左右）
        Timer timer = new Timer(16, e -> {
            spawnFirework();
            updateFireworks();
            repaint();
        });
        timer.start();
    }

    private void spawnFirework() {
        // 控制生成频率
        if (random.nextInt(10) != 0) return;

        int x = getWidth() / 2 + random.nextInt(200) - 100;
        int y = getHeight() / 2 + random.nextInt(200) - 100;

        fireworks.add(new FireworkText(x, y));
    }

    private void updateFireworks() {
        Iterator<FireworkText> it = fireworks.iterator();
        while (it.hasNext()) {
            FireworkText f = it.next();
            f.update();
            if (f.life <= 0) {
                it.remove();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setFont(new Font("微软雅黑", Font.BOLD, FONT_SIZE));

        for (FireworkText f : fireworks) {
            g2.setColor(f.color);
            g2.drawString(TEXT, (int) f.x, (int) f.y);
        }
    }

    // ================= 烟花文字对象 =================
    static class FireworkText {
        double x, y;
        double vx, vy;
        int life = 120;

        Color color;

        FireworkText(int x, int y) {
            this.x = x;
            this.y = y;

            double angle = Math.random() * Math.PI * 2;
            double speed = 2 + Math.random() * 4;

            vx = Math.cos(angle) * speed;
            vy = Math.sin(angle) * speed - 1.5;

            color = new Color(
                    200 + (int)(Math.random() * 55),
                    (int)(Math.random() * 120),
                    0
            );
        }

        void update() {
            x += vx;
            y += vy;

            vy += 0.05; // 重力感
            life--;
        }
    }

    // ================= 主窗口 =================
    public static void main(String[] args) {
        JFrame frame = new JFrame("🎆 新年快乐 · 烟花级别 🎆");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NewYearFireworks panel = new NewYearFireworks();
        frame.setContentPane(panel);

        frame.setSize(1400, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
