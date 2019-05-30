package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {

    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;

    int[][] field;
    int fieldSizeX;
    int fieldSizeY;
    int winLength;

    int cellHeight;
    int cellWidth;

    boolean isInit = false;


    public Map() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {

            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    private void update(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        System.out.println(cellX + " " + cellY);
        repaint();
    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + winLength);

        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLength = winLength;
        field = new int[fieldSizeY][fieldSizeX];

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }

//        g.drawOval(2,2,cellWidth-4,cellHeight-4);

//        g.drawLine(2,2,cellWidth-2,cellHeight-2);
//        g.drawLine(2,cellHeight-2,cellWidth-2,2);

    }

    public void drawCross(MouseEvent e, Graphics g) {

        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

//        System.out.println(cellX + " " + cellY);

//        if (processMouseEvent(e);)

        g.drawLine(cellX + 2, cellY + 2, cellX + cellWidth - 2, cellY + cellHeight - 2);
        g.drawLine(cellX + 2, cellY + cellHeight - 2, cellX + cellWidth - 2, cellY + 2);
        repaint();
    }
}
