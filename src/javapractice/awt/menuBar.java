package javapractice.awt;

import java.awt.*;
import java.awt.event.*;


// import java.awt.CheckboxMenuItem;
// import java.awt.Frame;
// import java.awt.Menu;
// import java.awt.MenuBar;
// import java.awt.MenuItem;
// import java.awt.TextField;
// import java.awt.event.ActionListener;
// import java.awt.event.WindowListener;
// import java.awt.event.ItemListener;

class myMenu extends Frame {
    MenuBar m,m1;
    CheckboxMenuItem cm;
    MenuItem open, save, close, closeAll,undo,redo;
    Menu file, sub,edit,view,navi,source,refactor,run,debug,profile,team,tools,window,help;
    TextField tf;

    public myMenu() {
        super("MENU BAR DEMO");
        addWindowListener(new myList());
        
        open = new MenuItem("OPEN");
        save = new MenuItem("SAVE");
        close = new MenuItem("CLOSE");
        closeAll = new MenuItem("CLOSE ALL");
        undo = new MenuItem("UNDO");
        redo = new MenuItem("REDO");
        cm = new CheckboxMenuItem("AUTO SAVE");

        
        file = new Menu("FILE");
        edit = new Menu("EDIT");
        view = new Menu("VIEW");
        navi = new Menu("NAVIGATE");
        sub = new Menu("CLOSE");
        source = new Menu("SOURCE");
        refactor = new Menu("REFACTOR");
        run = new Menu("RUN");
        debug = new Menu("DEBUG");
        profile = new Menu("PROFILE");
        team = new Menu("TEAM");
        tools = new Menu("TOOLS");
        window = new Menu("WINDOW");
        help = new Menu("HELP");
        
        sub.add(close);
        sub.add(closeAll);

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(cm);
        
        edit.add(undo);
        edit.add(redo);
        
        m = new MenuBar();
        m.add(file);
        m.add(view);
        m.add(edit);
        m.add(navi);
        m.add(source);
        m.add(refactor);
        m.add(run);
        m.add(debug);
        m.add(profile);
        m.add(team);
        m.add(tools);
        m.add(window);
        m.add(help);
        setMenuBar(m);
       

    }
    class myList extends WindowAdapter
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }
}

public class menuBar {
    public static void main(String[] args) {
        myMenu m = new myMenu();
        m.setSize(800, 800);
        m.setVisible(true);
    }

}
