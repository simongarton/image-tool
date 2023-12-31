ImageTool

Simple encapsulation of the AWT BufferedImage / Graphics2D stuff, just a quick way of adding image
functionality to anything.

```
final ImageTool imageTool = new ImageTool(800, 800);
imageTool.setColor(new Color(100, 50, 25));
imageTool.fillOval(400, 400, 200, 200);
imageTool.save(Path.of("temp", "circle.png"));
```

Simon Garton
simon.garton@gmail.com
simongarton.com
January 2024