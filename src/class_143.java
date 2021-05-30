import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

// $FF: renamed from: aw
public final class class_143 extends class_142 {

   // $FF: renamed from: v java.awt.Component
   Component field_1819;
   // $FF: renamed from: n java.awt.Image
   Image field_1820;


   // $FF: renamed from: d (java.awt.Component) void
   final void method_3065(Component var1) {
      this.field_1819 = var1;
   }

   // $FF: renamed from: v (java.awt.Component, int) void
   final void method_3066(Component var1, int var2) {
      try {
         this.field_1819 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "aw.v(" + ')');
      }
   }

   // $FF: renamed from: k (java.awt.Graphics, int, int, int, int) void
   final void method_3067(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field_1820, 0, 0, this.field_1819);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field_1819.repaint();
      }

   }

   // $FF: renamed from: f (int, int, int, int, int) void
   public final void method_3057(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.method_3069(this.field_1819.getGraphics(), var1, var2, var3, var4, (byte)51);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "aw.f(" + ')');
      }
   }

   // $FF: renamed from: y (java.awt.Graphics, int, int, int) void
   final void method_3068(Graphics var1, int var2, int var3, int var4) {
      try {
         try {
            var1.drawImage(this.field_1820, var2, var3, this.field_1819);
         } catch (Exception var6) {
            this.field_1819.repaint();
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "aw.y(" + ')');
      }
   }

   // $FF: renamed from: p (java.awt.Graphics, int, int, int, int, byte) void
   final void method_3069(Graphics var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.field_1820, 0, 0, this.field_1819);
            var1.setClip(var7);
         } catch (Exception var8) {
            this.field_1819.repaint();
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "aw.p(" + ')');
      }
   }

   // $FF: renamed from: <init> (int, int, java.awt.Component) void
   void method_3070(int var1, int var2, Component var3) {
      try {
         super.method_3063();
         this.field_1816 = 1768643867 * var1;
         this.field_1818 = -1013428683 * var2;
         this.field_1817 = new int[var1 * var2 + 1];
         DataBufferInt var4 = new DataBufferInt(this.field_1817, this.field_1817.length);
         DirectColorModel var5 = new DirectColorModel(32, 16711680, '\uff00', 255);
         WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(-740510445 * this.field_1816, this.field_1818 * 460788765), var4, (Point)null);
         this.field_1820 = new BufferedImage(var5, var6, false, new Hashtable());
         this.method_3066(var3, 1641802499);
         this.method_3053(872029974);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "aw.<init>(" + ')');
      }
   }

   // $FF: renamed from: r (java.awt.Component) void
   final void method_3071(Component var1) {
      this.field_1819 = var1;
   }

   // $FF: renamed from: b (java.awt.Component) void
   final void method_3072(Component var1) {
      this.field_1819 = var1;
   }

   // $FF: renamed from: m (java.awt.Graphics, int, int, int, int) void
   final void method_3073(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field_1820, 0, 0, this.field_1819);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field_1819.repaint();
      }

   }

   // $FF: renamed from: s (int, int) void
   public final void method_3056(int var1, int var2) {
      this.method_3068(this.field_1819.getGraphics(), var1, var2, 449663578);
   }

   // $FF: renamed from: u (int, int) void
   public final void method_3062(int var1, int var2) {
      this.method_3068(this.field_1819.getGraphics(), var1, var2, -1522589377);
   }

   // $FF: renamed from: l (int, int, int, int) void
   public final void method_3058(int var1, int var2, int var3, int var4) {
      this.method_3069(this.field_1819.getGraphics(), var1, var2, var3, var4, (byte)29);
   }

   // $FF: renamed from: o (int, int, int, int) void
   public final void method_3054(int var1, int var2, int var3, int var4) {
      this.method_3069(this.field_1819.getGraphics(), var1, var2, var3, var4, (byte)71);
   }

   // $FF: renamed from: c (int, int, int, int) void
   public final void method_3060(int var1, int var2, int var3, int var4) {
      this.method_3069(this.field_1819.getGraphics(), var1, var2, var3, var4, (byte)40);
   }

   // $FF: renamed from: e (java.awt.Graphics, int, int) void
   final void method_3074(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field_1820, var2, var3, this.field_1819);
      } catch (Exception var5) {
         this.field_1819.repaint();
      }

   }

   // $FF: renamed from: g (java.awt.Graphics, int, int) void
   final void method_3075(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field_1820, var2, var3, this.field_1819);
      } catch (Exception var5) {
         this.field_1819.repaint();
      }

   }

   // $FF: renamed from: a (java.awt.Graphics, int, int, int, int) void
   final void method_3076(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field_1820, 0, 0, this.field_1819);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field_1819.repaint();
      }

   }

   // $FF: renamed from: j (java.awt.Component) void
   final void method_3077(Component var1) {
      this.field_1819 = var1;
   }

   // $FF: renamed from: n (int, int, int) void
   public final void method_3059(int var1, int var2, int var3) {
      try {
         this.method_3068(this.field_1819.getGraphics(), var1, var2, 1867252423);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "aw.n(" + ')');
      }
   }
}
