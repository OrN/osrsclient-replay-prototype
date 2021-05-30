import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// $FF: renamed from: az
public final class class_145 implements KeyListener, FocusListener {

   // $FF: renamed from: cz int[]
   public static int[] field_1829;
   // $FF: renamed from: n int
   public static final int field_1830 = 13;
   // $FF: renamed from: f int
   static final int field_1831 = 1;
   // $FF: renamed from: by int
   static final int field_1832 = 8;
   // $FF: renamed from: r int
   static final int field_1833 = 5;
   // $FF: renamed from: x int
   static final int field_1834 = 21;
   // $FF: renamed from: d int
   static final int field_1835 = 7;
   // $FF: renamed from: s int
   static final int field_1836 = 8;
   // $FF: renamed from: p int
   static final int field_1837 = 3;
   // $FF: renamed from: b int
   static final int field_1838 = 6;
   // $FF: renamed from: t int
   static final int field_1839 = 24;
   // $FF: renamed from: cn boolean[]
   public static boolean[] field_1840;
   // $FF: renamed from: cc char[]
   static char[] field_1841;
   // $FF: renamed from: co int[]
   public static int[] field_1842;
   // $FF: renamed from: cj int
   public static int field_1843;
   // $FF: renamed from: cu int[]
   static int[] field_1844;
   // $FF: renamed from: cx int
   public static volatile int field_1845;
   // $FF: renamed from: v az
   public static class_145 field_1846;
   // $FF: renamed from: cb int
   public static int field_1847;
   // $FF: renamed from: ce int
   public static int field_1848;
   // $FF: renamed from: ch int
   public static int field_1849;
   // $FF: renamed from: cy int
   public static int field_1850;
   // $FF: renamed from: ck int
   public static int field_1851;
   // $FF: renamed from: ca int[]
   static int[] field_1852;
   // $FF: renamed from: c int
   static final int field_1853 = 12;
   // $FF: renamed from: bk int
   static final int field_1854 = 91;
   // $FF: renamed from: rp int
   static final int field_1855 = 50;


   // $FF: renamed from: l () int
   public static int method_3082() {
      return field_1845 * 1384960375;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      try {
         if(null != field_1846) {
            int var2 = var1.getKeyCode();
            if(var2 >= 0 && var2 < field_1852.length) {
               var2 = field_1852[var2];
               if(0 != (var2 & 128)) {
                  var2 = -1;
               }
            } else {
               var2 = -1;
            }

            if(-1243891281 * field_1843 >= 0 && var2 >= 0) {
               field_1842[field_1843 * -1243891281] = var2;
               field_1843 = 1023229263 * (-1243891281 * field_1843 + 1 & 127);
               if(field_1843 * -1243891281 == -961604687 * field_1851) {
                  field_1843 = -1023229263;
               }
            }

            int var3;
            if(var2 >= 0) {
               var3 = 1 + field_1849 * -1003990119 & 127;
               if(var3 != 924382931 * field_1848) {
                  field_1844[field_1849 * -1003990119] = var2;
                  field_1841[-1003990119 * field_1849] = 0;
                  field_1849 = -102149975 * var3;
               }
            }

            var3 = var1.getModifiers();
            if(0 != (var3 & 10) || var2 == 85 || 10 == var2) {
               var1.consume();
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      try {
         if(field_1846 != null) {
            int var2 = var1.getKeyCode();
            if(var2 >= 0 && var2 < field_1852.length) {
               var2 = field_1852[var2] & -129;
            } else {
               var2 = -1;
            }

            if(-1243891281 * field_1843 >= 0 && var2 >= 0) {
               field_1842[-1243891281 * field_1843] = ~var2;
               field_1843 = 1023229263 * (1 + -1243891281 * field_1843 & 127);
               if(field_1851 * -961604687 == field_1843 * -1243891281) {
                  field_1843 = -1023229263;
               }
            }
         }

         var1.consume();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: s (java.awt.Component) void
   static void method_3083(Component var0) {
      var0.removeKeyListener(field_1846);
      var0.removeFocusListener(field_1846);
      field_1843 = -1023229263;
   }

   // $FF: renamed from: r (java.awt.Component) void
   static void method_3084(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(field_1846);
      var0.addFocusListener(field_1846);
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if(null != field_1846) {
            field_1843 = -1023229263;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_145 var10000 = new class_145();
      field_1846 = var10000;
      field_1840 = new boolean[112];
      field_1842 = new int[128];
      field_1851 = 0;
      field_1843 = 0;
      field_1841 = new char[128];
      field_1844 = new int[128];
      field_1829 = new int[128];
      field_1847 = 0;
      field_1848 = 0;
      field_1849 = 0;
      field_1850 = 0;
      field_1845 = 0;
      field_1852 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   }

   // $FF: renamed from: g (java.awt.event.KeyEvent) void
   public final synchronized void method_3086(KeyEvent var1) {
      if(field_1846 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field_1852.length) {
            var2 = field_1852[var2] & -129;
         } else {
            var2 = -1;
         }

         if(-1243891281 * field_1843 >= 0 && var2 >= 0) {
            field_1842[-1243891281 * field_1843] = ~var2;
            field_1843 = 1023229263 * (1 + 726865432 * field_1843 & 127);
            if(field_1851 * -2042424269 == field_1843 * 1743937277) {
               field_1843 = -1024292703;
            }
         }
      }

      var1.consume();
   }

   // $FF: renamed from: j (java.awt.Component) void
   static void method_3087(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(field_1846);
      var0.addFocusListener(field_1846);
   }

   // $FF: renamed from: o (java.awt.event.KeyEvent) void
   public final synchronized void method_3088(KeyEvent var1) {
      if(null != field_1846) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field_1852.length) {
            var2 = field_1852[var2];
            if(0 != (var2 & 128)) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(-1243891281 * field_1843 >= 0 && var2 >= 0) {
            field_1842[field_1843 * -1243891281] = var2;
            field_1843 = -1532485050 * (-1747068864 * field_1843 + 1 & 127);
            if(field_1843 * -1243891281 == -961604687 * field_1851) {
               field_1843 = -1023229263;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = 1 + field_1849 * -1003990119 & -104932764;
            if(var3 != 924382931 * field_1848) {
               field_1844[field_1849 * -1003990119] = var2;
               field_1841[-1003990119 * field_1849] = 0;
               field_1849 = -102149975 * var3;
            }
         }

         var3 = var1.getModifiers();
         if(0 != (var3 & 10) || var2 == 1355986493 || 10 == var2) {
            var1.consume();
         }
      }

   }

   // $FF: renamed from: af (int, cf, boolean, int) int
   static int method_3089(int var0, int var3) {
      try {
         if(var0 >= 7200) {
            if(var3 <= -1450187478) {
               throw new IllegalStateException();
            }

            if(var0 < 7204) {
               if(var3 <= -1450187478) {
                  throw new IllegalStateException();
               }

               class_136.field_1752 -= -1143668849;
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
               return 1;
            }
         }

         if(var0 == 7204) {
            if(var3 <= -1450187478) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 2063571218;
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
               return 1;
            }
         } else {
            if(var0 >= 7205) {
               if(var3 <= -1450187478) {
                  throw new IllegalStateException();
               }

               if(var0 < 7209) {
                  if(var3 <= -1450187478) {
                     throw new IllegalStateException();
                  }

                  class_165.field_2052[class_136.field_1752 * -26460885 - 1] = -1;
                  return 1;
               }
            }

            if(7209 == var0) {
               class_136.field_1752 -= 2119512838;
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
               return 1;
            } else if(var0 >= 7210 && var0 < 7214) {
               class_136.field_1752 -= -1087727229;
               return 1;
            } else if(var0 == 7214) {
               if(var3 <= -1450187478) {
                  throw new IllegalStateException();
               } else {
                  class_136.field_1752 -= 2119512838;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: b (java.awt.Component) void
   static void method_3090(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(field_1846);
      var0.addFocusListener(field_1846);
   }

   // $FF: renamed from: u () int
   public static int method_3091() {
      return field_1845 * 1384960375;
   }

   public final void keyTyped(KeyEvent var1) {
      try {
         if(null != field_1846) {
            char var2 = var1.getKeyChar();
            if(var2 != 0 && '\uffff' != var2 && class_333.method_5919(var2, 1457822410)) {
               int var3 = field_1849 * -1003990119 + 1 & 127;
               if(var3 != 924382931 * field_1848) {
                  field_1844[field_1849 * -1003990119] = -1;
                  field_1841[-1003990119 * field_1849] = var2;
                  field_1849 = -102149975 * var3;
               }
            }
         }

         var1.consume();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: h (java.awt.event.FocusEvent) void
   public final synchronized void method_3092() {
      if(null != field_1846) {
         field_1843 = -1023229263;
      }

   }

   // $FF: renamed from: c (java.awt.event.KeyEvent) void
   public final synchronized void method_3093(KeyEvent var1) {
      if(null != field_1846) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field_1852.length) {
            var2 = field_1852[var2];
            if(0 != (var2 & 128)) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(-1243891281 * field_1843 >= 0 && var2 >= 0) {
            field_1842[field_1843 * -1243891281] = var2;
            field_1843 = 1023229263 * (-1243891281 * field_1843 + 1 & 127);
            if(field_1843 * -1243891281 == -961604687 * field_1851) {
               field_1843 = -1023229263;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = 1 + field_1849 * -1003990119 & 127;
            if(var3 != 924382931 * field_1848) {
               field_1844[field_1849 * -1003990119] = var2;
               field_1841[-1003990119 * field_1849] = 0;
               field_1849 = -102149975 * var3;
            }
         }

         var3 = var1.getModifiers();
         if(0 != (var3 & 10) || var2 == 85 || 10 == var2) {
            var1.consume();
         }
      }

   }

   // $FF: renamed from: e (java.awt.event.KeyEvent) void
   public final synchronized void method_3094(KeyEvent var1) {
      if(field_1846 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field_1852.length) {
            var2 = field_1852[var2] & 804604178;
         } else {
            var2 = -1;
         }

         if(-2032800796 * field_1843 >= 0 && var2 >= 0) {
            field_1842[1758921521 * field_1843] = ~var2;
            field_1843 = -1143461166 * (1 + -1700648716 * field_1843 & 1781078619);
            if(field_1851 * -961604687 == field_1843 * -633337638) {
               field_1843 = -1023229263;
            }
         }
      }

      var1.consume();
   }

   // $FF: renamed from: m (java.awt.event.KeyEvent) void
   public final void method_3095(KeyEvent var1) {
      if(null != field_1846) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && '\uffff' != var2 && class_333.method_5919(var2, -668193091)) {
            int var3 = field_1849 * -1003990119 + 1 & 127;
            if(var3 != 924382931 * field_1848) {
               field_1844[field_1849 * -1003990119] = -1;
               field_1841[-1003990119 * field_1849] = var2;
               field_1849 = -102149975 * var3;
            }
         }
      }

      var1.consume();
   }

   // $FF: renamed from: a (java.awt.event.KeyEvent) void
   public final synchronized void method_3096(KeyEvent var1) {
      if(field_1846 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field_1852.length) {
            var2 = field_1852[var2] & -531034008;
         } else {
            var2 = -1;
         }

         if(-1243891281 * field_1843 >= 0 && var2 >= 0) {
            field_1842[-1243891281 * field_1843] = ~var2;
            field_1843 = 1023229263 * (1 + -1243891281 * field_1843 & -635063753);
            if(field_1851 * 260703270 == field_1843 * -108018245) {
               field_1843 = -1222989528;
            }
         }
      }

      var1.consume();
   }

   // $FF: renamed from: k (java.awt.event.KeyEvent) void
   public final void method_3097(KeyEvent var1) {
      if(null != field_1846) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && '\uffff' != var2 && class_333.method_5919(var2, 1910765757)) {
            int var3 = field_1849 * -1003990119 + 1 & 127;
            if(var3 != 924382931 * field_1848) {
               field_1844[field_1849 * -2119706558] = -1;
               field_1841[-1003990119 * field_1849] = var2;
               field_1849 = -1416602918 * var3;
            }
         }
      }

      var1.consume();
   }

   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: x (java.awt.event.KeyEvent) void
   public final void method_3098(KeyEvent var1) {
      if(null != field_1846) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && '\uffff' != var2 && class_333.method_5919(var2, -767124792)) {
            int var3 = field_1849 * -1003990119 + 1 & 127;
            if(var3 != 924382931 * field_1848) {
               field_1844[field_1849 * -1003990119] = -1;
               field_1841[-1003990119 * field_1849] = var2;
               field_1849 = -102149975 * var3;
            }
         }
      }

      var1.consume();
   }

   // $FF: renamed from: z (java.awt.event.FocusEvent) void
   public final void method_3099() {}

   // $FF: renamed from: w (java.awt.event.FocusEvent) void
   public final void method_3100() {}

   // $FF: renamed from: t (java.awt.event.FocusEvent) void
   public final void method_3101() {}

   // $FF: renamed from: <init> () void
   class_145() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: q (java.awt.event.FocusEvent) void
   public final synchronized void method_3103() {
      if(null != field_1846) {
         field_1843 = -1023229263;
      }

   }

   // $FF: renamed from: j (int) void
   public static void method_3104() {
      try {
         class_77.field_666.method_5074();
         class_77.field_655.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: d (java.awt.Component) void
   static void method_3105(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(field_1846);
      var0.addFocusListener(field_1846);
   }
}
