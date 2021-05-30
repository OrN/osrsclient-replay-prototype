import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

// $FF: renamed from: eh
public class class_86 extends class_59 {

   // $FF: renamed from: p java.lang.String
   public String field_791;
   // $FF: renamed from: n hz
   static class_272 field_792;
   // $FF: renamed from: f char
   char field_793;
   // $FF: renamed from: y int
   public int field_794;
   // $FF: renamed from: o int[]
   static int[] field_795;
   // $FF: renamed from: v jv
   public static class_306 field_796;
   // $FF: renamed from: u long
   static final long field_797 = -3932672073523589310L;
   // $FF: renamed from: be int
   public static final int field_798 = 86;
   // $FF: renamed from: az int
   static final int field_799 = 40;
   // $FF: renamed from: j boolean
   boolean field_800;


   // $FF: renamed from: n (int) void
   void method_1460(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "eh.n(" + ')');
      }
   }

   // $FF: renamed from: k () boolean
   public boolean method_1461() {
      return 115 == this.field_793;
   }

   // $FF: renamed from: f (nd, short) void
   void method_1462(class_28 var1, short var2) {
      try {
         while(true) {
            int var3 = var1.method_130(306272902);
            if(var3 == 0) {
               if(var2 == 2048) {
                  return;
               }

               return;
            }

            this.method_1463(var1, var3, (byte)36);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eh.f(" + ')');
      }
   }

   // $FF: renamed from: y (nd, int, byte) void
   void method_1463(class_28 var1, int var2, byte var3) {
      try {
         if(var2 == 1) {
            if(var3 <= 1) {
               return;
            }

            byte var5 = var1.method_131((byte)9);
            int var6 = var5 & 255;
            if(0 == var6) {
               if(var3 <= 1) {
                  throw new IllegalStateException();
               }

               throw new IllegalArgumentException("" + Integer.toString(var6, 16));
            }

            if(var6 >= 128) {
               if(var3 <= 1) {
                  throw new IllegalStateException();
               }

               if(var6 < 160) {
                  if(var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  char var7 = class_337.field_3881[var6 - 128];
                  if(var7 == 0) {
                     if(var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var7 = 63;
                  }

                  var6 = var7;
               }
            }

            char var4 = (char)var6;
            this.field_793 = var4;
         } else if(2 == var2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_794 = var1.method_135((byte)-96) * 274622721;
         } else if(var2 == 4) {
            this.field_800 = false;
         } else if(var2 == 5) {
            this.field_791 = var1.method_139(-391631059);
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "eh.y(" + ')');
      }
   }

   // $FF: renamed from: p (short) boolean
   public boolean method_1464(short var1) {
      try {
         boolean var10000;
         if(115 == this.field_793) {
            if(var1 <= 180) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "eh.p(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_792 = var10000;
   }

   // $FF: renamed from: r (int) eh
   public static class_86 method_1466(int var0) {
      class_86 var1 = (class_86)field_792.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_796.method_5381(11, var0, -26460885);
         class_86 var10000 = new class_86();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1462(var10001, (short)18623);
         }

         var1.method_1460(-2088745886);
         field_792.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: <init> () void
   class_86() {
      super();
      try {
         this.field_800 = true;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "eh.<init>(" + ')');
      }
   }

   // $FF: renamed from: b (int) eh
   public static class_86 method_1467(int var0) {
      class_86 var1 = (class_86)field_792.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_796.method_5381(11, var0, -26460885);
         class_86 var10000 = new class_86();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1462(var10001, (short)-19186);
         }

         var1.method_1460(-755358361);
         field_792.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: s (nd) void
   void method_1468(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(-399686340);
         if(var2 == 0) {
            return;
         }

         this.method_1463(var1, var2, (byte)90);
      }
   }

   // $FF: renamed from: x () void
   public static void method_1469() {
      field_792.method_5074();
   }

   // $FF: renamed from: l (nd, int) void
   void method_1470(class_28 var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.method_131((byte)-15);
         int var5 = var4 & 255;
         if(0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if(var5 >= -680007362 && var5 < 160) {
            int var6 = class_337.field_3881[var5 - 760029151];
            if(var6 == 0) {
               var6 = 661408074;
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field_793 = var3;
      } else if(2 == var2) {
         this.field_794 = var1.method_135((byte)-125) * 274622721;
      } else if(var2 == 4) {
         this.field_800 = false;
      } else if(var2 == 5) {
         this.field_791 = var1.method_139(-391631059);
      }

   }

   // $FF: renamed from: o (nd, int) void
   void method_1471(class_28 var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.method_131((byte)-112);
         int var5 = var4 & 255;
         if(0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if(var5 >= 934636304 && var5 < -1302594126) {
            char var6 = class_337.field_3881[var5 - 128];
            if(var6 == 0) {
               var6 = 63;
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field_793 = var3;
      } else if(2 == var2) {
         this.field_794 = var1.method_135((byte)-18) * 274622721;
      } else if(var2 == 4) {
         this.field_800 = false;
      } else if(var2 == 5) {
         this.field_791 = var1.method_139(-391631059);
      }

   }

   // $FF: renamed from: d (nd) void
   void method_1472(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(1571719260);
         if(var2 == 0) {
            return;
         }

         this.method_1463(var1, var2, (byte)98);
      }
   }

   // $FF: renamed from: e (nd, int) void
   void method_1473(class_28 var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.method_131((byte)-22);
         int var5 = var4 & 255;
         if(0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if(var5 >= 128 && var5 < 160) {
            char var6 = class_337.field_3881[var5 - 128];
            if(var6 == 0) {
               var6 = 63;
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field_793 = var3;
      } else if(2 == var2) {
         this.field_794 = var1.method_135((byte)-33) * 274622721;
      } else if(var2 == 4) {
         this.field_800 = false;
      } else if(var2 == 5) {
         this.field_791 = var1.method_139(-391631059);
      }

   }

   // $FF: renamed from: g (nd, int) void
   void method_1474(class_28 var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.method_131((byte)-3);
         int var5 = var4 & 1461260145;
         if(0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if(var5 >= -1019476135 && var5 < 2012192192) {
            char var6 = class_337.field_3881[var5 - 1114273262];
            if(var6 == 0) {
               var6 = 63;
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field_793 = var3;
      } else if(2 == var2) {
         this.field_794 = var1.method_135((byte)-89) * -351273036;
      } else if(var2 == 4) {
         this.field_800 = false;
      } else if(var2 == 5) {
         this.field_791 = var1.method_139(-391631059);
      }

   }

   // $FF: renamed from: u (nd) void
   void method_1475(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(-1375962132);
         if(var2 == 0) {
            return;
         }

         this.method_1463(var1, var2, (byte)84);
      }
   }

   // $FF: renamed from: m () void
   public static void method_1476() {
      field_792.method_5074();
   }

   // $FF: renamed from: c (nd, int) void
   void method_1477(class_28 var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.method_131((byte)-37);
         int var5 = var4 & 255;
         if(0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if(var5 >= 128 && var5 < 160) {
            char var6 = class_337.field_3881[var5 - 128];
            if(var6 == 0) {
               var6 = 63;
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field_793 = var3;
      } else if(2 == var2) {
         this.field_794 = var1.method_135((byte)-67) * 274622721;
      } else if(var2 == 4) {
         this.field_800 = false;
      } else if(var2 == 5) {
         this.field_791 = var1.method_139(-391631059);
      }

   }

   // $FF: renamed from: a () boolean
   public boolean method_1478() {
      return 115 == this.field_793;
   }

   // $FF: renamed from: n (nd, java.lang.String, int) int
   public static int method_1479(class_28 var0, String var1, int var2) {
      try {
         int var3 = var0.field_15 * -442398587;
         byte[] var4 = class_96.method_1782(var1, (byte)1);
         var0.method_154(var4.length, 1514054821);
         var0.field_15 += class_283.field_3254.method_5128(var4, 0, var4.length, var0.field_12, -442398587 * var0.field_15, -1771956050) * -1025691571;
         return -442398587 * var0.field_15 - var3;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "eh.n(" + ')');
      }
   }

   // $FF: renamed from: v (byte[], byte) oh
   public static final class_67 method_1480(byte[] var0, byte var1) {
      try {
         BufferedImage var2 = null;

         class_67 var10000;
         try {
            var2 = ImageIO.read(new ByteArrayInputStream(var0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            var10000 = new class_67(var5, var3, var4);
            return var10000;
         } catch (IOException var7) {
            ;
         } catch (InterruptedException var8) {
            ;
         }

         var10000 = new class_67(0, 0);
         return var10000;
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "eh.v(" + ')');
      }
   }

   // $FF: renamed from: p (nb, int, int) boolean
   static boolean method_1481(class_29 var0, int var1, int var2) {
      try {
         int var3 = var0.method_361(2, (byte)-17);
         int var4;
         int var5;
         int var8;
         int var9;
         int var10;
         int var11;
         if(0 == var3) {
            if(var2 == 2009401455) {
               throw new IllegalStateException();
            } else {
               if(var0.method_361(1, (byte)18) != 0) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  method_1481(var0, var1, -1783675716);
               }

               var4 = var0.method_361(13, (byte)-84);
               var5 = var0.method_361(13, (byte)10);
               boolean var10000;
               if(var0.method_361(1, (byte)-6) == 1) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var13 = var10000;
               if(var13) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  class_195.field_2314[(class_195.field_2320 += -1575538987) * -1149592963 - 1] = var1;
               }

               if(client.field_1605[var1] != null) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  class_100[] var15 = client.field_1605;
                  class_100 var10002 = new class_100();
                  class_100 var14 = var15[var1] = var10002;
                  var14.field_1142 = var1 * -1619133141;
                  if(null != class_195.field_2312[var1]) {
                     if(var2 == 2009401455) {
                        throw new IllegalStateException();
                     }

                     var14.method_1824(class_195.field_2312[var1], (byte)1);
                  }

                  var14.field_1106 = class_195.field_2310[var1] * -87192211;
                  var14.field_1128 = class_195.field_2317[var1] * -187990533;
                  var8 = class_195.field_2309[var1];
                  var9 = var8 >> 28;
                  var10 = var8 >> 14 & 255;
                  var11 = var8 & 255;
                  var14.field_1086[0] = class_195.field_2311[var1];
                  var14.field_1163 = 1571462451 * (byte)var9;
                  var14.method_1835((var10 << 13) + var4 - 697161691 * class_243.field_2700, (var11 << 13) + var5 - class_154.field_1929 * -27903763, 1441238495);
                  var14.field_1168 = false;
                  return true;
               }
            }
         } else if(1 == var3) {
            if(var2 == 2009401455) {
               throw new IllegalStateException();
            } else {
               var4 = var0.method_361(2, (byte)82);
               var5 = class_195.field_2309[var1];
               class_195.field_2309[var1] = (var5 & 268435455) + ((var4 + (var5 >> 28) & 3) << 28);
               return false;
            }
         } else {
            int var6;
            int var7;
            if(2 == var3) {
               var4 = var0.method_361(5, (byte)30);
               var5 = var4 >> 3;
               var6 = var4 & 7;
               var7 = class_195.field_2309[var1];
               var8 = var5 + (var7 >> 28) & 3;
               var9 = var7 >> 14 & 255;
               var10 = var7 & 255;
               if(var6 == 0) {
                  --var9;
                  --var10;
               }

               if(1 == var6) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  --var10;
               }

               if(2 == var6) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  ++var9;
                  --var10;
               }

               if(var6 == 3) {
                  --var9;
               }

               if(var6 == 4) {
                  ++var9;
               }

               if(5 == var6) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  --var9;
                  ++var10;
               }

               if(6 == var6) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  ++var10;
               }

               if(7 == var6) {
                  if(var2 == 2009401455) {
                     throw new IllegalStateException();
                  }

                  ++var9;
                  ++var10;
               }

               class_195.field_2309[var1] = var10 + (var9 << 14) + (var8 << 28);
               return false;
            } else {
               var4 = var0.method_361(18, (byte)29);
               var5 = var4 >> 16;
               var6 = var4 >> 8 & 255;
               var7 = var4 & 255;
               var8 = class_195.field_2309[var1];
               var9 = var5 + (var8 >> 28) & 3;
               var10 = (var8 >> 14) + var6 & 255;
               var11 = var7 + var8 & 255;
               class_195.field_2309[var1] = var11 + (var10 << 14) + (var9 << 28);
               return false;
            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "eh.p(" + ')');
      }
   }
}
