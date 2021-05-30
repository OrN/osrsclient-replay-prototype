import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

// $FF: renamed from: ak
public class class_131 implements MouseListener, MouseMotionListener, FocusListener {

   // $FF: renamed from: m int
   public static int field_1701;
   // $FF: renamed from: f int
   static final int field_1702 = 4;
   // $FF: renamed from: o int
   public static int field_1703;
   // $FF: renamed from: p ak
   public static class_131 field_1704;
   // $FF: renamed from: r int
   static volatile int field_1705;
   // $FF: renamed from: b int
   static volatile int field_1706;
   // $FF: renamed from: d int
   static volatile int field_1707;
   // $FF: renamed from: s long
   static volatile long field_1708;
   // $FF: renamed from: u int
   public static int field_1709;
   // $FF: renamed from: v int
   static final int field_1710 = 1;
   // $FF: renamed from: x int
   public static int field_1711;
   // $FF: renamed from: y long
   public static long field_1712;
   // $FF: renamed from: c int
   static volatile int field_1713;
   // $FF: renamed from: e int
   static volatile int field_1714;
   // $FF: renamed from: g int
   static volatile int field_1715;
   // $FF: renamed from: a long
   static volatile long field_1716;
   // $FF: renamed from: k int
   public static int field_1717;
   // $FF: renamed from: j int
   public static volatile int field_1718;
   // $FF: renamed from: hr int
   static int field_1719;
   // $FF: renamed from: z long
   public static long field_1720;
   // $FF: renamed from: pf int
   static final int field_1721 = 1;
   // $FF: renamed from: l int
   public static int field_1722;
   // $FF: renamed from: n int
   public static final int field_1723 = 200;


   // $FF: renamed from: v (double) double
   static double method_2874(double var0) {
      try {
         return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.v(" + ')');
      }
   }

   // $FF: renamed from: ab (java.awt.event.MouseEvent) void
   public final synchronized void method_2875(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1706 = -494421185;
         field_1707 = -1569435391;
         field_1708 = var1.getWhen() * 6626452511999439039L;
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      try {
         if(null != field_1704) {
            field_1718 = 0;
            field_1714 = var1.getX() * 1537867177;
            field_1715 = var1.getY() * 1303582181;
            field_1716 = class_87.method_1516((byte)1) * 5733810010149540283L;
            field_1713 = this.method_2876(var1, 1689031104) * -621965751;
            if(field_1713 * -1156070407 != 0) {
               field_1705 = -1604755989 * field_1713;
            }
         }

         if(var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mousePressed(" + ')');
      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      try {
         if(null != field_1704) {
            field_1718 = 0;
            field_1705 = 0;
         }

         if(var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mouseReleased(" + ')');
      }
   }

   // $FF: renamed from: f (java.awt.event.MouseEvent, int) int
   final int method_2876(MouseEvent var1, int var2) {
      try {
         int var3 = var1.getButton();
         if(!var1.isAltDown()) {
            if(var2 <= 541089324) {
               throw new IllegalStateException();
            }

            if(2 != var3) {
               if(!var1.isMetaDown()) {
                  if(3 != var3) {
                     return 1;
                  }

                  if(var2 <= 541089324) {
                     throw new IllegalStateException();
                  }
               }

               return 2;
            }
         }

         return 4;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ak.f(" + ')');
      }
   }

   // $FF: renamed from: b (java.awt.event.MouseEvent) int
   final int method_2877(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && 2 != var2?(!var1.isMetaDown() && 3 != var2?1:2):4;
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      try {
         if(null != field_1704) {
            field_1718 = 0;
            field_1706 = -494421185;
            field_1707 = -1569435391;
            field_1708 = var1.getWhen() * 6626452511999439039L;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mouseExited(" + ')');
      }
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mouseDragged(" + ')');
      }
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mouseEntered(" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.focusGained(" + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if(field_1704 != null) {
            field_1705 = 0;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.focusLost(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_2878() {
      class_131 var10000 = new class_131;
      var10000.method_2884();
      field_1704 = var10000;
      field_1718 = 0;
      field_1705 = 0;
      field_1706 = -494421185;
      field_1707 = -1569435391;
      field_1708 = -6626452511999439039L;
      field_1709 = 0;
      field_1722 = 0;
      field_1703 = 0;
      field_1712 = 0L;
      field_1713 = 0;
      field_1714 = 0;
      field_1715 = 0;
      field_1716 = 0L;
      field_1717 = 0;
      field_1701 = 0;
      field_1711 = 0;
      field_1720 = 0L;
   }

   // $FF: renamed from: z (java.awt.event.FocusEvent) void
   public final void method_2879(FocusEvent var1) {}

   // $FF: renamed from: w (java.awt.event.FocusEvent) void
   public final void method_2880(FocusEvent var1) {}

   // $FF: renamed from: t (java.awt.event.FocusEvent) void
   public final void method_2881(FocusEvent var1) {}

   // $FF: renamed from: u (java.awt.event.MouseEvent) void
   public final synchronized void method_2882(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1714 = var1.getX() * 1537867177;
         field_1715 = var1.getY() * 1303582181;
         field_1716 = class_87.method_1516((byte)1) * 5733810010149540283L;
         field_1713 = this.method_2876(var1, 2038612362) * -621965751;
         if(field_1713 * -1156070407 != 0) {
            field_1705 = -1604755989 * field_1713;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   // $FF: renamed from: p () void
   public static void method_2883() {
      class_131 var0 = field_1704;
      synchronized(field_1704) {
         field_1709 = -40744581 * field_1705;
         field_1722 = field_1706 * 822596517;
         field_1703 = field_1707 * -381452709;
         field_1712 = field_1708 * -1969538407909689887L;
         field_1717 = 671619183 * field_1713;
         field_1701 = field_1714 * -1043757915;
         field_1711 = field_1715 * 518397864;
         field_1720 = field_1716 * -52424837630769195L;
         field_1713 = 0;
      }
   }

   // $FF: renamed from: <init> () void
   void method_2884() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ak.<init>(" + ')');
      }
   }

   // $FF: renamed from: l (java.awt.event.MouseEvent) void
   public final synchronized void method_2885(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1705 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   // $FF: renamed from: j () void
   public static void method_2886() {
      class_131 var0 = field_1704;
      synchronized(field_1704) {
         field_1709 = -40744581 * field_1705;
         field_1722 = field_1706 * 822596517;
         field_1703 = field_1707 * -381452709;
         field_1712 = field_1708 * -1969538407909689887L;
         field_1717 = 671619183 * field_1713;
         field_1701 = field_1714 * -1043757915;
         field_1711 = field_1715 * 42143541;
         field_1720 = field_1716 * -52424837630769195L;
         field_1713 = 0;
      }
   }

   // $FF: renamed from: r (int) void
   public static void method_2887(int var0) {
      field_1718 = var0 * 457540795;
   }

   // $FF: renamed from: s (java.awt.event.MouseEvent) void
   public final synchronized void method_2888(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1714 = var1.getX() * 1537867177;
         field_1715 = var1.getY() * 1303582181;
         field_1716 = class_87.method_1516((byte)1) * 5733810010149540283L;
         field_1713 = this.method_2876(var1, 1207513966) * -621965751;
         if(field_1713 * -1156070407 != 0) {
            field_1705 = -1604755989 * field_1713;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   // $FF: renamed from: d (java.awt.event.MouseEvent) void
   public final synchronized void method_2889(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1714 = var1.getX() * 1537867177;
         field_1715 = var1.getY() * 1303582181;
         field_1716 = class_87.method_1516((byte)1) * 5733810010149540283L;
         field_1713 = this.method_2876(var1, 1173205899) * -621965751;
         if(field_1713 * -1156070407 != 0) {
            field_1705 = -1604755989 * field_1713;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      try {
         if(var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mouseClicked(" + ')');
      }
   }

   // $FF: renamed from: la (int) void
   static void method_2890(int var0) {
      try {
         client.field_1463.method_4079(class_112.method_2238(class_266.field_3082, client.field_1463.field_2384, (byte)8), -1871678030);
         client.field_1660 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ak.la(" + ')');
      }
   }

   // $FF: renamed from: y () void
   public static void method_2891() {
      class_131 var0 = field_1704;
      synchronized(field_1704) {
         field_1709 = -40744581 * field_1705;
         field_1722 = field_1706 * 1371398121;
         field_1703 = field_1707 * 709284789;
         field_1712 = field_1708 * -1969538407909689887L;
         field_1717 = -1329280467 * field_1713;
         field_1701 = field_1714 * -1043757915;
         field_1711 = field_1715 * 42143541;
         field_1720 = field_1716 * -52424837630769195L;
         field_1713 = 0;
      }
   }

   // $FF: renamed from: i (java.awt.event.MouseEvent) void
   public final synchronized void method_2892(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1705 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   // $FF: renamed from: ae (java.awt.event.MouseEvent) void
   public final synchronized void method_2893(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1706 = -494421185;
         field_1707 = 1295926359;
         field_1708 = var1.getWhen() * 6626452511999439039L;
      }

   }

   // $FF: renamed from: ap (java.awt.event.MouseEvent) void
   public final synchronized void method_2894(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1706 = -494421185;
         field_1707 = -932244074;
         field_1708 = var1.getWhen() * 6626452511999439039L;
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      try {
         if(null != field_1704) {
            field_1718 = 0;
            field_1706 = var1.getX() * 494421185;
            field_1707 = var1.getY() * 1569435391;
            field_1708 = var1.getWhen() * 6626452511999439039L;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.mouseMoved(" + ')');
      }
   }

   // $FF: renamed from: al (java.awt.event.MouseEvent) void
   public final synchronized void method_2895(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   // $FF: renamed from: ad (java.awt.event.MouseEvent) void
   public final synchronized void method_2896(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   // $FF: renamed from: ai (java.awt.event.MouseEvent) void
   public final synchronized void method_2897(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1706 = var1.getX() * 494421185;
         field_1707 = var1.getY() * -47493745;
         field_1708 = var1.getWhen() * 6626452511999439039L;
      }

   }

   // $FF: renamed from: ar (java.awt.event.MouseEvent) void
   public final synchronized void method_2898(MouseEvent var1) {
      if(null != field_1704) {
         field_1718 = 0;
         field_1706 = var1.getX() * 494421185;
         field_1707 = var1.getY() * 1569435391;
         field_1708 = var1.getWhen() * 6626452511999439039L;
      }

   }

   // $FF: renamed from: fo (int, int) void
   static void method_2899(int var0, int var1) {
      try {
         if(-3 == var0) {
            if(var1 == -1888868577) {
               throw new IllegalStateException();
            }

            class_299.method_5348(class_305.field_3469, class_305.field_3451, class_305.field_3449, (byte)-50);
         } else if(-2 == var0) {
            if(var1 == -1888868577) {
               throw new IllegalStateException();
            }

            class_299.method_5348(class_305.field_3450, class_305.field_3671, class_305.field_3452, (byte)-101);
         } else if(var0 == -1) {
            if(var1 == -1888868577) {
               throw new IllegalStateException();
            }

            class_299.method_5348(class_305.field_3453, class_305.field_3454, class_305.field_3455, (byte)-52);
         } else if(3 == var0) {
            class_177.field_2194 = 1941427289;
            class_177.field_2199 = 452438349;
         } else if(var0 == 4) {
            if(var1 == -1888868577) {
               throw new IllegalStateException();
            }

            class_127.method_2396(0, -2043539672);
         } else if(5 == var0) {
            if(var1 == -1888868577) {
               throw new IllegalStateException();
            }

            class_177.field_2199 = 904876698;
            class_299.method_5348(class_305.field_3459, class_305.field_3460, class_305.field_3560, (byte)-2);
         } else {
            label228: {
               if(var0 != 68) {
                  label237: {
                     if(var1 == -1888868577) {
                        throw new IllegalStateException();
                     }

                     if(!client.field_1599) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        if(6 == var0) {
                           if(var1 == -1888868577) {
                              throw new IllegalStateException();
                           }
                           break label237;
                        }
                     }

                     if(var0 == 7) {
                        class_299.method_5348(class_305.field_3570, class_305.field_3667, class_305.field_3467, (byte)-70);
                     } else if(var0 == 8) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3468, class_305.field_3471, class_305.field_3470, (byte)-86);
                     } else if(9 == var0) {
                        class_299.method_5348(class_305.field_3615, class_305.field_3700, class_305.field_3473, (byte)-4);
                     } else if(10 == var0) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3474, class_305.field_3642, class_305.field_3476, (byte)-93);
                     } else if(var0 == 11) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3480, class_305.field_3478, class_305.field_3479, (byte)-44);
                     } else if(12 == var0) {
                        if(var1 == -1888868577) {
                           return;
                        }

                        class_299.method_5348(class_305.field_3606, class_305.field_3623, class_305.field_3690, (byte)-82);
                     } else if(13 == var0) {
                        class_299.method_5348(class_305.field_3483, class_305.field_3484, class_305.field_3485, (byte)-55);
                     } else if(var0 == 14) {
                        class_299.method_5348(class_305.field_3520, class_305.field_3487, class_305.field_3488, (byte)-65);
                     } else if(var0 == 16) {
                        class_299.method_5348(class_305.field_3489, class_305.field_3490, class_305.field_3652, (byte)-3);
                     } else if(17 == var0) {
                        class_299.method_5348(class_305.field_3492, class_305.field_3493, class_305.field_3689, (byte)-91);
                     } else if(18 == var0) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_127.method_2396(1, -2043539672);
                     } else if(19 == var0) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3692, class_305.field_3437, class_305.field_3500, (byte)-51);
                     } else if(var0 == 20) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3578, class_305.field_3558, class_305.field_3503, (byte)-81);
                     } else if(var0 == 22) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3577, class_305.field_3482, class_305.field_3506, (byte)-82);
                     } else if(var0 == 23) {
                        class_299.method_5348(class_305.field_3554, class_305.field_3466, class_305.field_3432, (byte)-124);
                     } else if(24 == var0) {
                        if(var1 == -1888868577) {
                           return;
                        }

                        class_299.method_5348(class_305.field_3679, class_305.field_3511, class_305.field_3512, (byte)-78);
                     } else if(25 == var0) {
                        if(var1 == -1888868577) {
                           return;
                        }

                        class_299.method_5348(class_305.field_3424, class_305.field_3465, class_305.field_3515, (byte)-8);
                     } else if(26 == var0) {
                        if(var1 == -1888868577) {
                           return;
                        }

                        class_299.method_5348(class_305.field_3477, class_305.field_3533, class_305.field_3518, (byte)-82);
                     } else if(var0 == 27) {
                        class_299.method_5348(class_305.field_3519, class_305.field_3564, class_305.field_3521, (byte)-64);
                     } else if(var0 == 31) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3658, class_305.field_3509, class_305.field_3530, (byte)-92);
                     } else if(var0 == 32) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3531, class_305.field_3532, class_305.field_3693, (byte)-62);
                     } else if(var0 == 37) {
                        if(var1 == -1888868577) {
                           return;
                        }

                        class_299.method_5348(class_305.field_3542, class_305.field_3535, class_305.field_3536, (byte)-119);
                     } else if(var0 == 38) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_299.method_5348(class_305.field_3537, class_305.field_3538, class_305.field_3539, (byte)-20);
                     } else if(var0 == 55) {
                        if(var1 == -1888868577) {
                           throw new IllegalStateException();
                        }

                        class_177.field_2194 = -549483624;
                     } else {
                        if(56 == var0) {
                           if(var1 == -1888868577) {
                              throw new IllegalStateException();
                           }

                           class_299.method_5348(class_305.field_3544, class_305.field_3545, class_305.field_3557, (byte)-27);
                           class_53.method_579(11, (byte)0);
                           return;
                        }

                        if(var0 == 57) {
                           if(var1 == -1888868577) {
                              throw new IllegalStateException();
                           }

                           class_299.method_5348(class_305.field_3547, class_305.field_3510, class_305.field_3549, (byte)-31);
                           class_53.method_579(11, (byte)0);
                           return;
                        }

                        if(61 == var0) {
                           class_177.field_2194 = 1666685477;
                        } else {
                           class_299.method_5348(class_305.field_3550, class_305.field_3551, class_305.field_3627, (byte)-96);
                        }
                     }
                     break label228;
                  }
               }

               class_299.method_5348(class_305.field_3462, class_305.field_3688, class_305.field_3464, (byte)-57);
            }
         }

         class_53.method_579(10, (byte)0);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.fo(" + ')');
      }
   }

   // $FF: renamed from: h (java.awt.event.FocusEvent) void
   public final synchronized void method_2900(FocusEvent var1) {
      if(field_1704 != null) {
         field_1705 = 0;
      }

   }

   // $FF: renamed from: q (java.awt.event.FocusEvent) void
   public final synchronized void method_2901(FocusEvent var1) {
      if(field_1704 != null) {
         field_1705 = 0;
      }

   }

   // $FF: renamed from: ke (byte) void
   static final void method_2902(byte var0) {
      try {
         class_40 var1 = class_112.method_2238(class_266.field_3048, client.field_1463.field_2384, (byte)8);
         var1.field_263.method_210(0, 303066737);
         client.field_1463.method_4079(var1, -1679766952);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ak.ke(" + ')');
      }
   }

   // $FF: renamed from: d (jv, int, short) op
   public static class_66 method_2903(class_306 var0, int var1, short var2) {
      try {
         if(!class_148.method_3128(var0, var1, -1461937174)) {
            if(var2 != 234) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_66 var10000 = new class_66;
            var10000.method_105();
            class_66 var4 = var10000;
            var4.field_497 = -1099363635 * class_403.field_4276;
            var4.field_494 = class_380.field_4201 * -821679425;
            var4.field_495 = class_223.field_2529[0];
            var4.field_496 = class_284.field_3260[0];
            var4.field_498 = class_403.field_4278[0];
            var4.field_492 = class_318.field_3787[0];
            var4.field_491 = class_192.field_2300;
            var4.field_493 = class_403.field_4279[0];
            class_192.method_3958(179304235);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ak.d(" + ')');
      }
   }
}
