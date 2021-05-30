import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

// $FF: renamed from: am
public final class class_133 implements class_5, MouseWheelListener {

   // $FF: renamed from: v int
   int field_1732;


   // $FF: renamed from: <init> () void
   class_133() {
      super();
      try {
         this.field_1732 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "am.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (java.awt.Component, int) void
   void method_2908(Component var1, int var2) {
      try {
         var1.removeMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "am.n(" + ')');
      }
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      try {
         this.field_1732 += var1.getWheelRotation() * -721792881;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "am.mouseWheelMoved(" + ')');
      }
   }

   // $FF: renamed from: f (int) int
   public synchronized int method_8(int var1) {
      try {
         int var2 = this.field_1732 * 1696386671;
         this.field_1732 = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "am.f(" + ')');
      }
   }

    // $FF: renamed from: v (java.awt.Component, int) void
   void method_2911(Component var1, int var2) {
      try {
         var1.addMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "am.v(" + ')');
      }
   }

   // $FF: renamed from: r () int
   public synchronized int method_9() {
      int var1 = this.field_1732 * 1696386671;
      this.field_1732 = 0;
      return var1;
   }
}
