import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

// $FF: renamed from: di
public class class_195 {

   // $FF: renamed from: f byte[]
   static byte[] field_2308;
   // $FF: renamed from: s int[]
   static int[] field_2309;
   // $FF: renamed from: u int[]
   static int[] field_2310;
   // $FF: renamed from: y byte[]
   static byte[] field_2311;
   // $FF: renamed from: p nd[]
   static Buffer[] field_2312;
   // $FF: renamed from: j int
   static int field_2313;
   // $FF: renamed from: c int[]
   static int[] field_2314;
   // $FF: renamed from: b int
   static int field_2315;
   // $FF: renamed from: d int[]
   static int[] field_2316;
   // $FF: renamed from: l int[]
   static int[] field_2317;
   // $FF: renamed from: r int[]
   static int[] field_2318;
   // $FF: renamed from: v int
   static final int field_2319 = 2;
   // $FF: renamed from: o int
   static int field_2320;
   // $FF: renamed from: n int
   static final int field_2321 = 1;
   // $FF: renamed from: e nd
   static Buffer field_2322;


   // $FF: renamed from: k (nb, int) void
   static void method_3966(class_29 var0, int var1) {
      boolean var2 = var0.method_361(1, (byte)76) == 1;
      if(var2) {
         field_2314[(field_2320 += -1575538987) * -1149592963 - 1] = var1;
      }

      int var3 = var0.method_361(2, (byte)-94);
      class_100 var4 = client.field_1605[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field_1168 = false;
         } else if(var1 == 929092845 * client.field_1534) {
            throw new RuntimeException();
         } else {
            field_2309[var1] = (var4.field_1112[0] + class_243.field_2700 * 697161691 >> 13 << 14) + (var4.field_1163 * 671262203 << 28) + (var4.field_1126[0] + -27903763 * class_154.field_1929 >> 13);
            if(var4.field_1104 * 800070667 != -1) {
               field_2310[var1] = var4.field_1104 * 800070667;
            } else {
               field_2310[var1] = var4.field_1106 * -1173912475;
            }

            field_2317[var1] = var4.field_1128 * 637535539;
            client.field_1605[var1] = null;
            if(var0.method_361(1, (byte)5) != 0) {
               class_86.method_1481(var0, var1, -1276444616);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method_361(3, (byte)3);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(2 == var5) {
               ++var6;
               --var7;
            } else if(3 == var5) {
               --var6;
            } else if(4 == var5) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(6 == var5) {
               ++var7;
            } else if(7 == var5) {
               ++var6;
               ++var7;
            }

            if(client.field_1534 * 929092845 == var1 && (-130212619 * var4.field_1077 < 1536 || 1248597615 * var4.field_1076 < 1536 || var4.field_1077 * -130212619 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = var6 * 258210291;
               var4.field_1144 = var7 * 770404467;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else if(2 == var3) {
            var5 = var0.method_361(4, (byte)-75);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(0 == var5) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(2 == var5) {
               var7 -= 2;
            } else if(3 == var5) {
               ++var6;
               var7 -= 2;
            } else if(4 == var5) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(10 == var5) {
               var6 += 2;
               ++var7;
            } else if(11 == var5) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(13 == var5) {
               var7 += 2;
            } else if(14 == var5) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.field_1534 * 929092845 == var1 && (-130212619 * var4.field_1077 < 1536 || 1248597615 * var4.field_1076 < 1536 || -130212619 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = 258210291 * var6;
               var4.field_1144 = 770404467 * var7;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else {
            var5 = var0.method_361(1, (byte)-95);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method_361(12, (byte)-81);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var4.field_1112[0] + var8;
               var11 = var9 + var4.field_1126[0];
               if(var1 == client.field_1534 * 929092845 && (-130212619 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 1536 || -130212619 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = 258210291 * var10;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = 1571462451 * (byte)(671262203 * var4.field_1163 + var7 & 3);
               if(929092845 * client.field_1534 == var1) {
                  class_115.field_1289 = var4.field_1163 * -1993331315;
               }

            } else {
               var6 = var0.method_361(30, (byte)-1);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var4.field_1112[0] + 697161691 * class_243.field_2700 + var8 & 16383) - 697161691 * class_243.field_2700;
               var11 = (var4.field_1126[0] + -27903763 * class_154.field_1929 + var9 & 16383) - -27903763 * class_154.field_1929;
               if(var1 == 929092845 * client.field_1534 && (-130212619 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 1536 || -130212619 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = var10 * 258210291;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = (byte)(var4.field_1163 * 671262203 + var7 & 3) * 1571462451;
               if(var1 == 929092845 * client.field_1534) {
                  class_115.field_1289 = -1993331315 * var4.field_1163;
               }

            }
         }
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2308 = new byte[2048];
      field_2311 = new byte[2048];
      field_2312 = new Buffer[2048];
      field_2313 = 0;
      field_2318 = new int[2048];
      field_2315 = 0;
      field_2316 = new int[2048];
      field_2309 = new int[2048];
      field_2310 = new int[2048];
      field_2317 = new int[2048];
      field_2320 = 0;
      field_2314 = new int[2048];
      Buffer var10000 = new Buffer(new byte[5000]);
      field_2322 = var10000;
   }

   // $FF: renamed from: r (nb) void
   static final void method_3968(class_29 var0) {
      var0.method_358();
      int var1 = 929092845 * client.field_1534;
      class_100[] var10000 = client.field_1605;
      class_100 var10002 = new class_100();
      class_100 var2 = class_164.field_2044 = var10000[var1] = var10002;
      var2.field_1142 = var1 * -1619133141;
      int var3 = var0.method_361(30, (byte)-35);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field_1112[0] = var5 - class_243.field_2700 * 697161691;
      var2.field_1077 = ((var2.field_1112[0] << 7) + (var2.method_1833(1340867034) << 6)) * -1369591971;
      var2.field_1126[0] = var6 - class_154.field_1929 * -27903763;
      var2.field_1076 = ((var2.field_1126[0] << 7) + (var2.method_1833(-1462095810) << 6)) * -1747711857;
      class_115.field_1289 = (var2.field_1163 = 1571462451 * var4) * -1993331315;
      if(field_2312[var1] != null) {
         var2.method_1824(field_2312[var1], (byte)1);
      }

      field_2313 = 0;
      field_2318[(field_2313 += 1909342277) * -1143549299 - 1] = var1;
      field_2308[var1] = 0;
      field_2315 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method_361(18, (byte)-4);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            field_2309[var7] = (var9 << 28) + (var10 << 14) + var11;
            field_2310[var7] = 0;
            field_2317[var7] = -1;
            field_2316[(field_2315 += -262660203) * -1936837699 - 1] = var7;
            field_2308[var7] = 0;
         }
      }

      var0.method_362();
   }

   // $FF: renamed from: b (nb) void
   static final void method_3969(class_29 var0) {
      var0.method_358();
      int var1 = 929092845 * client.field_1534;
      class_100[] var10000 = client.field_1605;
      class_100 var10002 = new class_100();
      class_100 var2 = class_164.field_2044 = var10000[var1] = var10002;
      var2.field_1142 = var1 * -1619133141;
      int var3 = var0.method_361(30, (byte)17);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field_1112[0] = var5 - class_243.field_2700 * 697161691;
      var2.field_1077 = ((var2.field_1112[0] << 7) + (var2.method_1833(1028321113) << 6)) * -1369591971;
      var2.field_1126[0] = var6 - class_154.field_1929 * -27903763;
      var2.field_1076 = ((var2.field_1126[0] << 7) + (var2.method_1833(-1030385338) << 6)) * -1747711857;
      class_115.field_1289 = (var2.field_1163 = 1571462451 * var4) * -1993331315;
      if(field_2312[var1] != null) {
         var2.method_1824(field_2312[var1], (byte)1);
      }

      field_2313 = 0;
      field_2318[(field_2313 += 1909342277) * -1143549299 - 1] = var1;
      field_2308[var1] = 0;
      field_2315 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method_361(18, (byte)30);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            field_2309[var7] = (var9 << 28) + (var10 << 14) + var11;
            field_2310[var7] = 0;
            field_2317[var7] = -1;
            field_2316[(field_2315 += -262660203) * -1936837699 - 1] = var7;
            field_2308[var7] = 0;
         }
      }

      var0.method_362();
   }

   // $FF: renamed from: x (nb, int) boolean
   static boolean method_3970(class_29 var0, int var1) {
      int var2 = var0.method_361(2, (byte)34);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if(0 == var2) {
         if(var0.method_361(1, (byte)15) != 0) {
            class_86.method_1481(var0, var1, 155129408);
         }

         var3 = var0.method_361(13, (byte)63);
         var4 = var0.method_361(13, (byte)1);
         boolean var11 = var0.method_361(1, (byte)15) == 1;
         if(var11) {
            field_2314[(field_2320 += -1575538987) * -1149592963 - 1] = var1;
         }

         if(client.field_1605[var1] != null) {
            throw new RuntimeException();
         } else {
            class_100[] var10000 = client.field_1605;
            class_100 var10002 = new class_100();
            class_100 var12 = var10000[var1] = var10002;
            var12.field_1142 = var1 * -1619133141;
            if(null != field_2312[var1]) {
               var12.method_1824(field_2312[var1], (byte)1);
            }

            var12.field_1106 = field_2310[var1] * -87192211;
            var12.field_1128 = field_2317[var1] * -187990533;
            var7 = field_2309[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var12.field_1086[0] = field_2311[var1];
            var12.field_1163 = 1571462451 * (byte)var8;
            var12.method_1835((var9 << 13) + var3 - 697161691 * class_243.field_2700, (var10 << 13) + var4 - class_154.field_1929 * -27903763);
            var12.field_1168 = false;
            return true;
         }
      } else if(1 == var2) {
         var3 = var0.method_361(2, (byte)-76);
         var4 = field_2309[var1];
         field_2309[var1] = (var4 & 268435455) + ((var3 + (var4 >> 28) & 3) << 28);
         return false;
      } else {
         int var5;
         int var6;
         if(2 == var2) {
            var3 = var0.method_361(5, (byte)21);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = field_2309[var1];
            var7 = var4 + (var6 >> 28) & 3;
            var8 = var6 >> 14 & 255;
            var9 = var6 & 255;
            if(var5 == 0) {
               --var8;
               --var9;
            }

            if(1 == var5) {
               --var9;
            }

            if(2 == var5) {
               ++var8;
               --var9;
            }

            if(var5 == 3) {
               --var8;
            }

            if(var5 == 4) {
               ++var8;
            }

            if(5 == var5) {
               --var8;
               ++var9;
            }

            if(6 == var5) {
               ++var9;
            }

            if(7 == var5) {
               ++var8;
               ++var9;
            }

            field_2309[var1] = var9 + (var8 << 14) + (var7 << 28);
            return false;
         } else {
            var3 = var0.method_361(18, (byte)-6);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var6 = var3 & 255;
            var7 = field_2309[var1];
            var8 = var4 + (var7 >> 28) & 3;
            var9 = (var7 >> 14) + var5 & 255;
            var10 = var6 + var7 & 255;
            field_2309[var1] = var10 + (var9 << 14) + (var8 << 28);
            return false;
         }
      }
   }

   // $FF: renamed from: d (nb) void
   static final void method_3971(class_29 var0) {
      var0.method_358();
      int var1 = 929092845 * client.field_1534;
      class_100[] var10000 = client.field_1605;
      class_100 var10002 = new class_100();
      class_100 var2 = class_164.field_2044 = var10000[var1] = var10002;
      var2.field_1142 = var1 * -1619133141;
      int var3 = var0.method_361(30, (byte)67);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field_1112[0] = var5 - class_243.field_2700 * 697161691;
      var2.field_1077 = ((var2.field_1112[0] << 7) + (var2.method_1833(-883419378) << 6)) * -1369591971;
      var2.field_1126[0] = var6 - class_154.field_1929 * -27903763;
      var2.field_1076 = ((var2.field_1126[0] << 7) + (var2.method_1833(-835038180) << 6)) * -1747711857;
      class_115.field_1289 = (var2.field_1163 = 1571462451 * var4) * -1993331315;
      if(field_2312[var1] != null) {
         var2.method_1824(field_2312[var1], (byte)1);
      }

      field_2313 = 0;
      field_2318[(field_2313 += 1909342277) * -1143549299 - 1] = var1;
      field_2308[var1] = 0;
      field_2315 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method_361(18, (byte)-31);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            field_2309[var7] = (var9 << 28) + (var10 << 14) + var11;
            field_2310[var7] = 0;
            field_2317[var7] = -1;
            field_2316[(field_2315 += -262660203) * -1936837699 - 1] = var7;
            field_2308[var7] = 0;
         }
      }

      var0.method_362();
   }

   // $FF: renamed from: u (nb) void
   static final void method_3972(class_29 var0) {
      var0.method_358();
      int var1 = -552499060 * client.field_1534;
      class_100[] var10000 = client.field_1605;
      class_100 var10002 = new class_100();
      class_100 var2 = class_164.field_2044 = var10000[var1] = var10002;
      var2.field_1142 = var1 * -600030510;
      int var3 = var0.method_361(30, (byte)-45);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 1435074988;
      var2.field_1112[0] = var5 - class_243.field_2700 * 697161691;
      var2.field_1077 = ((var2.field_1112[0] << 7) + (var2.method_1833(-1879769923) << 6)) * -1369591971;
      var2.field_1126[0] = var6 - class_154.field_1929 * 144193968;
      var2.field_1076 = ((var2.field_1126[0] << 7) + (var2.method_1833(-1707695614) << 6)) * 665161609;
      class_115.field_1289 = (var2.field_1163 = 1511573935 * var4) * -1993331315;
      if(field_2312[var1] != null) {
         var2.method_1824(field_2312[var1], (byte)1);
      }

      field_2313 = 0;
      field_2318[(field_2313 += 1812298285) * -1143549299 - 1] = var1;
      field_2308[var1] = 0;
      field_2315 = 0;

      for(int var7 = 1; var7 < -1471218458; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method_361(18, (byte)-62);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & -1770231511;
            int var11 = var8 & 47389133;
            field_2309[var7] = (var9 << 28) + (var10 << 14) + var11;
            field_2310[var7] = 0;
            field_2317[var7] = -1;
            field_2316[(field_2315 += -1095640364) * 1579350255 - 1] = var7;
            field_2308[var7] = 0;
         }
      }

      var0.method_362();
   }

   // $FF: renamed from: l (nb, int) void
   static final void method_3973(class_29 var0, int var1) {
      int var2 = -1130505350 * var0.offset;
      field_2320 = 0;
      class_139.method_3008(var0, -1831454192);

      for(int var3 = 0; var3 < field_2320 * -1149592963; ++var3) {
         int var4 = field_2314[var3];
         class_100 var5 = client.field_1605[var4];
         int var6 = var0.readUnsignedByte();
         if(0 != (var6 & -1699177628)) {
            var6 += var0.readUnsignedByte() << 8;
         }

         byte var7 = -1;
         if(0 != (var6 & 8)) {
            var5.field_1128 = var0.readShort() * -187990533;
            if(var5.field_1128 * 637535539 == 23886835) {
               var5.field_1128 = 187990533;
            }
         }

         int var8;
         if(0 != (var6 & 47713042)) {
            var5.field_1113 = var0.method_169() * 590622678;
            var8 = var0.method_179();
            var5.field_1117 = 1296170927 * (var8 >> 16);
            var5.field_1127 = (-1702273423 * client.field_1425 + (var8 & 1285032793)) * 203474704;
            var5.field_1102 = 0;
            var5.field_1115 = 0;
            if(-2037880546 * var5.field_1127 > client.field_1425 * 1298989588) {
               var5.field_1102 = 1070847525;
            }

            if(-1332450768 == var5.field_1113 * -1915525677) {
               var5.field_1113 = -1634941531;
            }
         }

         int var9;
         int var11;
         int var12;
         int var15;
         if((var6 & 16) != 0) {
            var8 = var0.method_113();
            int var10;
            int var13;
            int var14;
            if(var8 > 0) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var11 = -1;
                  var12 = -1;
                  var13 = -1;
                  var10 = var0.method_144();
                  if(var10 == 32767) {
                     var10 = var0.method_144();
                     var12 = var0.method_144();
                     var11 = var0.method_144();
                     var13 = var0.method_144();
                  } else if(var10 != 2062149992) {
                     var12 = var0.method_144();
                  } else {
                     var10 = -1;
                  }

                  var14 = var0.method_144();
                  var5.method_1794(var10, var12, var11, var13, client.field_1425 * -760854931, var14, (byte)5);
               }
            }

            var9 = var0.readUnsignedByte();
            if(var9 > 0) {
               for(var10 = 0; var10 < var9; ++var10) {
                  var11 = var0.method_144();
                  var12 = var0.method_144();
                  if(var12 != 32767) {
                     var13 = var0.method_144();
                     var14 = var0.method_237();
                     var15 = var12 > 0?var0.method_159():var14;
                     var5.method_1805(var11, -1702273423 * client.field_1425, var12, var13, var14, var15, (byte)-115);
                  } else {
                     var5.method_1809(var11, (byte)-3);
                  }
               }
            }
         }

         if((var6 & 1) != 0) {
            var5.field_1104 = var0.method_170() * -702771293;
            if(0 == 1818985587 * var5.field_1130) {
               var5.field_1106 = 151448332 * var5.field_1104;
               var5.field_1104 = 702771293;
            }
         }

         if(0 != (var6 & 2048)) {
            field_2311[var4] = var0.method_157();
         }

         if((var6 & 230685870) != 0) {
            for(var8 = 0; var8 < 3; ++var8) {
               var5.field_1146[var8] = var0.method_139(-391631059);
            }
         }

         if((var6 & -2073485268) != 0) {
            var5.field_1118 = var0.method_123() * -64437987;
            var5.field_1120 = var0.method_162() * 2120129099;
            var5.field_1109 = var0.method_162() * -1684756142;
            var5.field_1078 = var0.method_157() * -280468969;
            var5.field_1105 = (var0.readShort() + client.field_1425 * -1702273423) * 2093690946;
            var5.field_1123 = (var0.method_169() + -2086162791 * client.field_1425) * -999940959;
            var5.field_1124 = var0.method_170() * -410013785;
            if(var5.field_1168) {
               var5.field_1118 += var5.field_1155 * 1628507480;
               var5.field_1120 += 1234105563 * var5.field_1144;
               var5.field_1109 += 68005351 * var5.field_1155;
               var5.field_1078 += 792449741 * var5.field_1144;
               var5.field_1130 = 0;
            } else {
               var5.field_1118 += var5.field_1112[0] * 372835010;
               var5.field_1120 += var5.field_1126[0] * -2087635779;
               var5.field_1109 += -260652731 * var5.field_1112[0];
               var5.field_1078 += 134778290 * var5.field_1126[0];
               var5.field_1130 = -2139872387;
            }

            var5.field_1114 = 0;
         }

         if((var6 & 64) != 0) {
            var8 = var0.method_169();
            class_292 var16 = (class_292)class_197.method_4016(class_391.method_6773(), var0.method_113(), -611336247);
            boolean var19 = var0.method_159() == 1;
            var11 = var0.method_159();
            var12 = var0.offset * -442398587;
            if(var5.field_1148 != null && null != var5.field_1143) {
               boolean var21 = false;
               if(var16.field_3332 && class_208.field_2413.method_3325(var5.field_1148, 279756852)) {
                  var21 = true;
               }

               if(!var21 && -267997189 * client.field_1531 == 0 && !var5.field_1154) {
                  field_2322.offset = 0;
                  var0.method_243(field_2322.data, 0, var11, (short)18306);
                  field_2322.offset = 0;
                  String var22 = class_68.method_868(class_135.method_2942(class_38.method_449(field_2322), -847170794));
                  var5.field_1089 = var22.trim();
                  var5.field_1093 = -424817097 * (var8 >> 8);
                  var5.field_1094 = (var8 & 255) * 887098339;
                  var5.field_1092 = 878499530;
                  var5.field_1090 = var19;
                  var5.field_1088 = var5 != class_164.field_2044 && var16.field_3332 && client.field_1639 != "" && var22.toLowerCase().indexOf(client.field_1639) == -1;
                  if(var16.field_3331) {
                     var15 = var19?91:1;
                  } else {
                     var15 = var19?90:2;
                  }

                  if(-1 != 417414069 * var16.field_3330) {
                     class_149.method_3135(var15, class_174.method_3729(var16.field_3330 * -1285693866) + var5.field_1148.method_6272(), var22);
                  } else {
                     class_149.method_3135(var15, var5.field_1148.method_6272(), var22);
                  }
               }
            }

            var0.offset = (var12 + var11) * -1025691571;
         }

         if(0 != (var6 & 2)) {
            var8 = var0.method_159();
            byte[] var17 = new byte[var8];
            Buffer var10000 = new Buffer(var17);
            Buffer var20 = var10000;
            var0.method_243(var17, 0, var8, (short)27365);
            field_2312[var4] = var20;
            var5.method_1824(var20, (byte)1);
         }

         if(0 != (var6 & 4)) {
            var8 = var0.method_168();
            if(var8 == '\uffff') {
               var8 = -1;
            }

            var9 = var0.method_159();
            class_137.method_2969(var5, var8, var9, (byte)-44);
         }

         if((var6 & -278708644) != 0) {
            var7 = var0.method_162();
         }

         if(0 != (var6 & -24690253)) {
            var5.field_1089 = var0.method_139(-391631059);
            if(var5.field_1089.charAt(0) == 1899993571) {
               var5.field_1089 = var5.field_1089.substring(1);
               class_149.method_3135(2, var5.field_1148.method_6272(), var5.field_1089);
            } else if(class_164.field_2044 == var5) {
               class_149.method_3135(2, var5.field_1148.method_6272(), var5.field_1089);
            }

            var5.field_1090 = false;
            var5.field_1093 = 0;
            var5.field_1094 = 0;
            var5.field_1092 = 878499530;
         }

         if(var5.field_1168) {
            if(127 == var7) {
               var5.method_1835(var5.field_1155 * -40810693, 1966912699 * var5.field_1144);
            } else {
               byte var18;
               if(-1 != var7) {
                  var18 = var7;
               } else {
                  var18 = field_2311[var4];
               }

               var5.method_1846(595493157 * var5.field_1155, var5.field_1144 * 1966912699, var18, 2070611264);
            }
         }
      }

      if(var1 != var0.offset * -442398587 - var2) {
         throw new RuntimeException(var0.offset * 193015107 - var2 + " " + var1);
      }
   }

   // $FF: renamed from: o (nb, int) void
   static final void method_3974(class_29 var0, int var1) {
      int var2 = -442398587 * var0.offset;
      field_2320 = 0;
      class_139.method_3008(var0, -1775789856);

      for(int var3 = 0; var3 < field_2320 * -1149592963; ++var3) {
         int var4 = field_2314[var3];
         class_100 var5 = client.field_1605[var4];
         int var6 = var0.readUnsignedByte();
         if(0 != (var6 & 128)) {
            var6 += var0.readUnsignedByte() << 8;
         }

         byte var7 = -1;
         if(0 != (var6 & 8)) {
            var5.field_1128 = var0.readShort() * -187990533;
            if(var5.field_1128 * 637535539 == '\uffff') {
               var5.field_1128 = 187990533;
            }
         }

         int var8;
         if(0 != (var6 & 256)) {
            var5.field_1113 = var0.method_169() * 1634941531;
            var8 = var0.method_179();
            var5.field_1117 = 1296170927 * (var8 >> 16);
            var5.field_1127 = (-1702273423 * client.field_1425 + (var8 & '\uffff')) * -2033842497;
            var5.field_1102 = 0;
            var5.field_1115 = 0;
            if(58747199 * var5.field_1127 > client.field_1425 * -1702273423) {
               var5.field_1102 = 493221367;
            }

            if('\uffff' == var5.field_1113 * -1915525677) {
               var5.field_1113 = -1634941531;
            }
         }

         int var9;
         int var11;
         int var12;
         int var15;
         if((var6 & 16) != 0) {
            var8 = var0.method_113();
            int var10;
            int var13;
            int var14;
            if(var8 > 0) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var11 = -1;
                  var12 = -1;
                  var13 = -1;
                  var10 = var0.method_144();
                  if(var10 == 32767) {
                     var10 = var0.method_144();
                     var12 = var0.method_144();
                     var11 = var0.method_144();
                     var13 = var0.method_144();
                  } else if(var10 != 32766) {
                     var12 = var0.method_144();
                  } else {
                     var10 = -1;
                  }

                  var14 = var0.method_144();
                  var5.method_1794(var10, var12, var11, var13, client.field_1425 * -1702273423, var14, (byte)83);
               }
            }

            var9 = var0.readUnsignedByte();
            if(var9 > 0) {
               for(var10 = 0; var10 < var9; ++var10) {
                  var11 = var0.method_144();
                  var12 = var0.method_144();
                  if(var12 != 32767) {
                     var13 = var0.method_144();
                     var14 = var0.method_237();
                     var15 = var12 > 0?var0.method_159():var14;
                     var5.method_1805(var11, -1702273423 * client.field_1425, var12, var13, var14, var15, (byte)-99);
                  } else {
                     var5.method_1809(var11, (byte)-119);
                  }
               }
            }
         }

         if((var6 & 1) != 0) {
            var5.field_1104 = var0.method_170() * -702771293;
            if(0 == -664818219 * var5.field_1130) {
               var5.field_1106 = -2143486033 * var5.field_1104;
               var5.field_1104 = 702771293;
            }
         }

         if(0 != (var6 & 2048)) {
            field_2311[var4] = var0.method_157();
         }

         if((var6 & 512) != 0) {
            for(var8 = 0; var8 < 3; ++var8) {
               var5.field_1146[var8] = var0.method_139(-391631059);
            }
         }

         if((var6 & 8192) != 0) {
            var5.field_1118 = var0.method_123() * -64437987;
            var5.field_1120 = var0.method_162() * 2120129099;
            var5.field_1109 = var0.method_162() * -260652731;
            var5.field_1078 = var0.method_157() * -280468969;
            var5.field_1105 = (var0.readShort() + client.field_1425 * -1702273423) * 911678983;
            var5.field_1123 = (var0.method_169() + -1702273423 * client.field_1425) * -999940959;
            var5.field_1124 = var0.method_170() * -410013785;
            if(var5.field_1168) {
               var5.field_1118 += var5.field_1155 * 1969261743;
               var5.field_1120 += 1143697609 * var5.field_1144;
               var5.field_1109 += 68005351 * var5.field_1155;
               var5.field_1078 += 792449741 * var5.field_1144;
               var5.field_1130 = 0;
            } else {
               var5.field_1118 += var5.field_1112[0] * -64437987;
               var5.field_1120 += var5.field_1126[0] * 2120129099;
               var5.field_1109 += -260652731 * var5.field_1112[0];
               var5.field_1078 += -280468969 * var5.field_1126[0];
               var5.field_1130 = -2139872387;
            }

            var5.field_1114 = 0;
         }

         if((var6 & 64) != 0) {
            var8 = var0.method_169();
            class_292 var16 = (class_292)class_197.method_4016(class_391.method_6773(), var0.method_113(), -611336247);
            boolean var19 = var0.method_159() == 1;
            var11 = var0.method_159();
            var12 = var0.offset * -442398587;
            if(var5.field_1148 != null && null != var5.field_1143) {
               boolean var21 = false;
               if(var16.field_3332 && class_208.field_2413.method_3325(var5.field_1148, 279756852)) {
                  var21 = true;
               }

               if(!var21 && -267997189 * client.field_1531 == 0 && !var5.field_1154) {
                  field_2322.offset = 0;
                  var0.method_243(field_2322.data, 0, var11, (short)25246);
                  field_2322.offset = 0;
                  String var22 = class_68.method_868(class_135.method_2942(class_38.method_449(field_2322), -1984394636));
                  var5.field_1089 = var22.trim();
                  var5.field_1093 = -424817097 * (var8 >> 8);
                  var5.field_1094 = (var8 & 255) * 887098339;
                  var5.field_1092 = 878499530;
                  var5.field_1090 = var19;
                  var5.field_1088 = var5 != class_164.field_2044 && var16.field_3332 && client.field_1639 != "" && var22.toLowerCase().indexOf(client.field_1639) == -1;
                  if(var16.field_3331) {
                     var15 = var19?91:1;
                  } else {
                     var15 = var19?90:2;
                  }

                  if(-1 != 417414069 * var16.field_3330) {
                     class_149.method_3135(var15, class_174.method_3729(var16.field_3330 * 417414069) + var5.field_1148.method_6272(), var22);
                  } else {
                     class_149.method_3135(var15, var5.field_1148.method_6272(), var22);
                  }
               }
            }

            var0.offset = (var12 + var11) * -1025691571;
         }

         if(0 != (var6 & 2)) {
            var8 = var0.method_159();
            byte[] var17 = new byte[var8];
            Buffer var10000 = new Buffer(var17);
            Buffer var20 = var10000;
            var0.method_243(var17, 0, var8, (short)15620);
            field_2312[var4] = var20;
            var5.method_1824(var20, (byte)1);
         }

         if(0 != (var6 & 4)) {
            var8 = var0.method_168();
            if(var8 == '\uffff') {
               var8 = -1;
            }

            var9 = var0.method_159();
            class_137.method_2969(var5, var8, var9, (byte)80);
         }

         if((var6 & 4096) != 0) {
            var7 = var0.method_162();
         }

         if(0 != (var6 & 32)) {
            var5.field_1089 = var0.method_139(-391631059);
            if(var5.field_1089.charAt(0) == 126) {
               var5.field_1089 = var5.field_1089.substring(1);
               class_149.method_3135(2, var5.field_1148.method_6272(), var5.field_1089);
            } else if(class_164.field_2044 == var5) {
               class_149.method_3135(2, var5.field_1148.method_6272(), var5.field_1089);
            }

            var5.field_1090 = false;
            var5.field_1093 = 0;
            var5.field_1094 = 0;
            var5.field_1092 = 878499530;
         }

         if(var5.field_1168) {
            if(127 == var7) {
               var5.method_1835(var5.field_1155 * -40810693, 1966912699 * var5.field_1144);
            } else {
               byte var18;
               if(-1 != var7) {
                  var18 = var7;
               } else {
                  var18 = field_2311[var4];
               }

               var5.method_1846(-40810693 * var5.field_1155, var5.field_1144 * 1966912699, var18, 2070611264);
            }
         }
      }

      if(var1 != var0.offset * -442398587 - var2) {
         throw new RuntimeException(var0.offset * -442398587 - var2 + " " + var1);
      }
   }

   // $FF: renamed from: <init> () void
   class_195() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: h () void
   static void method_3976() {
      field_2313 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         field_2312[var0] = null;
         field_2311[var0] = 1;
      }

   }

   // $FF: renamed from: g (nb, int) void
   static void method_3977(class_29 var0, int var1) {
      boolean var2 = var0.method_361(1, (byte)74) == 1;
      if(var2) {
         field_2314[(field_2320 += -1575538987) * -1149592963 - 1] = var1;
      }

      int var3 = var0.method_361(2, (byte)-29);
      class_100 var4 = client.field_1605[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field_1168 = false;
         } else if(var1 == 929092845 * client.field_1534) {
            throw new RuntimeException();
         } else {
            field_2309[var1] = (var4.field_1112[0] + class_243.field_2700 * 697161691 >> 13 << 14) + (var4.field_1163 * 671262203 << 28) + (var4.field_1126[0] + -27903763 * class_154.field_1929 >> 13);
            if(var4.field_1104 * 800070667 != -1) {
               field_2310[var1] = var4.field_1104 * 800070667;
            } else {
               field_2310[var1] = var4.field_1106 * -1173912475;
            }

            field_2317[var1] = var4.field_1128 * 637535539;
            client.field_1605[var1] = null;
            if(var0.method_361(1, (byte)33) != 0) {
               class_86.method_1481(var0, var1, 1932131521);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method_361(3, (byte)31);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(2 == var5) {
               ++var6;
               --var7;
            } else if(3 == var5) {
               --var6;
            } else if(4 == var5) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(6 == var5) {
               ++var7;
            } else if(7 == var5) {
               ++var6;
               ++var7;
            }

            if(client.field_1534 * 929092845 == var1 && (-130212619 * var4.field_1077 < 1536 || 1248597615 * var4.field_1076 < 1536 || var4.field_1077 * -130212619 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = var6 * 258210291;
               var4.field_1144 = var7 * 770404467;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else if(2 == var3) {
            var5 = var0.method_361(4, (byte)-42);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(0 == var5) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(2 == var5) {
               var7 -= 2;
            } else if(3 == var5) {
               ++var6;
               var7 -= 2;
            } else if(4 == var5) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(10 == var5) {
               var6 += 2;
               ++var7;
            } else if(11 == var5) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(13 == var5) {
               var7 += 2;
            } else if(14 == var5) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.field_1534 * 929092845 == var1 && (-130212619 * var4.field_1077 < 1536 || 1248597615 * var4.field_1076 < 1536 || -130212619 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = 258210291 * var6;
               var4.field_1144 = 770404467 * var7;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else {
            var5 = var0.method_361(1, (byte)-10);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method_361(12, (byte)-71);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var4.field_1112[0] + var8;
               var11 = var9 + var4.field_1126[0];
               if(var1 == client.field_1534 * 929092845 && (-130212619 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 1536 || -130212619 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = 258210291 * var10;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = 1571462451 * (byte)(671262203 * var4.field_1163 + var7 & 3);
               if(929092845 * client.field_1534 == var1) {
                  class_115.field_1289 = var4.field_1163 * -1993331315;
               }

            } else {
               var6 = var0.method_361(30, (byte)-98);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var4.field_1112[0] + 697161691 * class_243.field_2700 + var8 & 16383) - 697161691 * class_243.field_2700;
               var11 = (var4.field_1126[0] + -27903763 * class_154.field_1929 + var9 & 16383) - -27903763 * class_154.field_1929;
               if(var1 == 929092845 * client.field_1534 && (-130212619 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 1536 || -130212619 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = var10 * 258210291;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = (byte)(var4.field_1163 * 671262203 + var7 & 3) * 1571462451;
               if(var1 == 929092845 * client.field_1534) {
                  class_115.field_1289 = -1993331315 * var4.field_1163;
               }

            }
         }
      }
   }

   // $FF: renamed from: a (nb, int) void
   static void method_3978(class_29 var0, int var1) {
      boolean var2 = var0.method_361(1, (byte)11) == 1;
      if(var2) {
         field_2314[(field_2320 += -1575538987) * -235223313 - 1] = var1;
      }

      int var3 = var0.method_361(2, (byte)-62);
      class_100 var4 = client.field_1605[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field_1168 = false;
         } else if(var1 == 1181394564 * client.field_1534) {
            throw new RuntimeException();
         } else {
            field_2309[var1] = (var4.field_1112[0] + class_243.field_2700 * 368245067 >> 13 << 14) + (var4.field_1163 * 671262203 << 28) + (var4.field_1126[0] + -27903763 * class_154.field_1929 >> 13);
            if(var4.field_1104 * 2060980859 != -1) {
               field_2310[var1] = var4.field_1104 * -1985178489;
            } else {
               field_2310[var1] = var4.field_1106 * -106614921;
            }

            field_2317[var1] = var4.field_1128 * 637535539;
            client.field_1605[var1] = null;
            if(var0.method_361(1, (byte)-30) != 0) {
               class_86.method_1481(var0, var1, 1727947512);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method_361(3, (byte)18);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(2 == var5) {
               ++var6;
               --var7;
            } else if(3 == var5) {
               --var6;
            } else if(4 == var5) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(6 == var5) {
               ++var7;
            } else if(7 == var5) {
               ++var6;
               ++var7;
            }

            if(client.field_1534 * -556704838 == var1 && (-130212619 * var4.field_1077 < 1660702878 || 382164315 * var4.field_1076 < -1881886981 || var4.field_1077 * -1250112136 >= 1054150813 || var4.field_1076 * 1248597615 >= 1974902010)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = var6 * -423024595;
               var4.field_1144 = var7 * 2068864713;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else if(2 == var3) {
            var5 = var0.method_361(4, (byte)17);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(0 == var5) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(2 == var5) {
               var7 -= 2;
            } else if(3 == var5) {
               ++var6;
               var7 -= 2;
            } else if(4 == var5) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(10 == var5) {
               var6 += 2;
               ++var7;
            } else if(11 == var5) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(13 == var5) {
               var7 += 2;
            } else if(14 == var5) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.field_1534 * 929092845 == var1 && (-2035998958 * var4.field_1077 < -824805174 || 1248597615 * var4.field_1076 < 1536 || -130212619 * var4.field_1077 >= -1504197750 || var4.field_1076 * -291327843 >= 11776)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = 258210291 * var6;
               var4.field_1144 = 770404467 * var7;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else {
            var5 = var0.method_361(1, (byte)51);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method_361(12, (byte)1);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & -18741985;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var4.field_1112[0] + var8;
               var11 = var9 + var4.field_1126[0];
               if(var1 == client.field_1534 * 1468703182 && (-1695629399 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 974043660 || -130212619 * var4.field_1077 >= -1239849052 || var4.field_1076 * 1248597615 >= 153139028)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = 258210291 * var10;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = -474431661 * (byte)(-842590157 * var4.field_1163 + var7 & 3);
               if(929092845 * client.field_1534 == var1) {
                  class_115.field_1289 = var4.field_1163 * -1993331315;
               }

            } else {
               var6 = var0.method_361(30, (byte)41);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 958911588;
               var9 = var6 & -1766015372;
               var10 = (var4.field_1112[0] + 697161691 * class_243.field_2700 + var8 & 1530498527) - 697161691 * class_243.field_2700;
               var11 = (var4.field_1126[0] + -27903763 * class_154.field_1929 + var9 & 16383) - -27903763 * class_154.field_1929;
               if(var1 == -1084684406 * client.field_1534 && (139215341 * var4.field_1077 < 1536 || var4.field_1076 * -1757664587 < -774333195 || -1322763373 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 11776)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = var10 * 1974156753;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = (byte)(var4.field_1163 * -479900314 + var7 & 3) * 1571462451;
               if(var1 == 929092845 * client.field_1534) {
                  class_115.field_1289 = -1993331315 * var4.field_1163;
               }

            }
         }
      }
   }

   // $FF: renamed from: c (nb, int) void
   static final void method_3979(class_29 var0, int var1) {
      int var2 = -442398587 * var0.offset;
      field_2320 = 0;
      class_139.method_3008(var0, -1378072382);

      for(int var3 = 0; var3 < field_2320 * -1149592963; ++var3) {
         int var4 = field_2314[var3];
         class_100 var5 = client.field_1605[var4];
         int var6 = var0.readUnsignedByte();
         if(0 != (var6 & 128)) {
            var6 += var0.readUnsignedByte() << 8;
         }

         byte var7 = -1;
         if(0 != (var6 & 8)) {
            var5.field_1128 = var0.readShort() * -187990533;
            if(var5.field_1128 * 637535539 == '\uffff') {
               var5.field_1128 = 187990533;
            }
         }

         int var8;
         if(0 != (var6 & 256)) {
            var5.field_1113 = var0.method_169() * 1634941531;
            var8 = var0.method_179();
            var5.field_1117 = 1296170927 * (var8 >> 16);
            var5.field_1127 = (-1702273423 * client.field_1425 + (var8 & '\uffff')) * -2033842497;
            var5.field_1102 = 0;
            var5.field_1115 = 0;
            if(58747199 * var5.field_1127 > client.field_1425 * -1702273423) {
               var5.field_1102 = 493221367;
            }

            if('\uffff' == var5.field_1113 * -1915525677) {
               var5.field_1113 = -1634941531;
            }
         }

         int var9;
         int var11;
         int var12;
         int var15;
         if((var6 & 16) != 0) {
            var8 = var0.method_113();
            int var10;
            int var13;
            int var14;
            if(var8 > 0) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var11 = -1;
                  var12 = -1;
                  var13 = -1;
                  var10 = var0.method_144();
                  if(var10 == 32767) {
                     var10 = var0.method_144();
                     var12 = var0.method_144();
                     var11 = var0.method_144();
                     var13 = var0.method_144();
                  } else if(var10 != 32766) {
                     var12 = var0.method_144();
                  } else {
                     var10 = -1;
                  }

                  var14 = var0.method_144();
                  var5.method_1794(var10, var12, var11, var13, client.field_1425 * -1702273423, var14, (byte)53);
               }
            }

            var9 = var0.readUnsignedByte();
            if(var9 > 0) {
               for(var10 = 0; var10 < var9; ++var10) {
                  var11 = var0.method_144();
                  var12 = var0.method_144();
                  if(var12 != 32767) {
                     var13 = var0.method_144();
                     var14 = var0.method_237();
                     var15 = var12 > 0?var0.method_159():var14;
                     var5.method_1805(var11, -1702273423 * client.field_1425, var12, var13, var14, var15, (byte)-55);
                  } else {
                     var5.method_1809(var11, (byte)-72);
                  }
               }
            }
         }

         if((var6 & 1) != 0) {
            var5.field_1104 = var0.method_170() * -702771293;
            if(0 == -664818219 * var5.field_1130) {
               var5.field_1106 = -2143486033 * var5.field_1104;
               var5.field_1104 = 702771293;
            }
         }

         if(0 != (var6 & 2048)) {
            field_2311[var4] = var0.method_157();
         }

         if((var6 & 512) != 0) {
            for(var8 = 0; var8 < 3; ++var8) {
               var5.field_1146[var8] = var0.method_139(-391631059);
            }
         }

         if((var6 & 8192) != 0) {
            var5.field_1118 = var0.method_123() * -64437987;
            var5.field_1120 = var0.method_162() * 2120129099;
            var5.field_1109 = var0.method_162() * -260652731;
            var5.field_1078 = var0.method_157() * -280468969;
            var5.field_1105 = (var0.readShort() + client.field_1425 * -1702273423) * 911678983;
            var5.field_1123 = (var0.method_169() + -1702273423 * client.field_1425) * -999940959;
            var5.field_1124 = var0.method_170() * -410013785;
            if(var5.field_1168) {
               var5.field_1118 += var5.field_1155 * 1969261743;
               var5.field_1120 += 1143697609 * var5.field_1144;
               var5.field_1109 += 68005351 * var5.field_1155;
               var5.field_1078 += 792449741 * var5.field_1144;
               var5.field_1130 = 0;
            } else {
               var5.field_1118 += var5.field_1112[0] * -64437987;
               var5.field_1120 += var5.field_1126[0] * 2120129099;
               var5.field_1109 += -260652731 * var5.field_1112[0];
               var5.field_1078 += -280468969 * var5.field_1126[0];
               var5.field_1130 = -2139872387;
            }

            var5.field_1114 = 0;
         }

         if((var6 & 64) != 0) {
            var8 = var0.method_169();
            class_292 var16 = (class_292)class_197.method_4016(class_391.method_6773(), var0.method_113(), -611336247);
            boolean var19 = var0.method_159() == 1;
            var11 = var0.method_159();
            var12 = var0.offset * -442398587;
            if(var5.field_1148 != null && null != var5.field_1143) {
               boolean var21 = false;
               if(var16.field_3332 && class_208.field_2413.method_3325(var5.field_1148, 279756852)) {
                  var21 = true;
               }

               if(!var21 && -267997189 * client.field_1531 == 0 && !var5.field_1154) {
                  field_2322.offset = 0;
                  var0.method_243(field_2322.data, 0, var11, (short)13155);
                  field_2322.offset = 0;
                  String var22 = class_68.method_868(class_135.method_2942(class_38.method_449(field_2322), -2020943954));
                  var5.field_1089 = var22.trim();
                  var5.field_1093 = -424817097 * (var8 >> 8);
                  var5.field_1094 = (var8 & 255) * 887098339;
                  var5.field_1092 = 878499530;
                  var5.field_1090 = var19;
                  var5.field_1088 = var5 != class_164.field_2044 && var16.field_3332 && client.field_1639 != "" && var22.toLowerCase().indexOf(client.field_1639) == -1;
                  if(var16.field_3331) {
                     var15 = var19?91:1;
                  } else {
                     var15 = var19?90:2;
                  }

                  if(-1 != 417414069 * var16.field_3330) {
                     class_149.method_3135(var15, class_174.method_3729(var16.field_3330 * 417414069) + var5.field_1148.method_6272(), var22);
                  } else {
                     class_149.method_3135(var15, var5.field_1148.method_6272(), var22);
                  }
               }
            }

            var0.offset = (var12 + var11) * -1025691571;
         }

         if(0 != (var6 & 2)) {
            var8 = var0.method_159();
            byte[] var17 = new byte[var8];
            Buffer var10000 = new Buffer(var17);
            Buffer var20 = var10000;
            var0.method_243(var17, 0, var8, (short)25059);
            field_2312[var4] = var20;
            var5.method_1824(var20, (byte)1);
         }

         if(0 != (var6 & 4)) {
            var8 = var0.method_168();
            if(var8 == '\uffff') {
               var8 = -1;
            }

            var9 = var0.method_159();
            class_137.method_2969(var5, var8, var9, (byte)-107);
         }

         if((var6 & 4096) != 0) {
            var7 = var0.method_162();
         }

         if(0 != (var6 & 32)) {
            var5.field_1089 = var0.method_139(-391631059);
            if(var5.field_1089.charAt(0) == 126) {
               var5.field_1089 = var5.field_1089.substring(1);
               class_149.method_3135(2, var5.field_1148.method_6272(), var5.field_1089);
            } else if(class_164.field_2044 == var5) {
               class_149.method_3135(2, var5.field_1148.method_6272(), var5.field_1089);
            }

            var5.field_1090 = false;
            var5.field_1093 = 0;
            var5.field_1094 = 0;
            var5.field_1092 = 878499530;
         }

         if(var5.field_1168) {
            if(127 == var7) {
               var5.method_1835(var5.field_1155 * -40810693, 1966912699 * var5.field_1144);
            } else {
               byte var18;
               if(-1 != var7) {
                  var18 = var7;
               } else {
                  var18 = field_2311[var4];
               }

               var5.method_1846(-40810693 * var5.field_1155, var5.field_1144 * 1966912699, var18, 2070611264);
            }
         }
      }

      if(var1 != var0.offset * -442398587 - var2) {
         throw new RuntimeException(var0.offset * -442398587 - var2 + " " + var1);
      }
   }

   // $FF: renamed from: m (nb, int) void
   static void method_3980(class_29 var0, int var1) {
      boolean var2 = var0.method_361(1, (byte)-4) == 1;
      if(var2) {
         field_2314[(field_2320 += -1330185254) * 1071908739 - 1] = var1;
      }

      int var3 = var0.method_361(2, (byte)-66);
      class_100 var4 = client.field_1605[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field_1168 = false;
         } else if(var1 == 929092845 * client.field_1534) {
            throw new RuntimeException();
         } else {
            field_2309[var1] = (var4.field_1112[0] + class_243.field_2700 * 1121616983 >> 13 << 14) + (var4.field_1163 * -2028877083 << 28) + (var4.field_1126[0] + -2081767351 * class_154.field_1929 >> 13);
            if(var4.field_1104 * 800070667 != -1) {
               field_2310[var1] = var4.field_1104 * 800070667;
            } else {
               field_2310[var1] = var4.field_1106 * -1998860042;
            }

            field_2317[var1] = var4.field_1128 * 637535539;
            client.field_1605[var1] = null;
            if(var0.method_361(1, (byte)-54) != 0) {
               class_86.method_1481(var0, var1, 1203744369);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method_361(3, (byte)48);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(2 == var5) {
               ++var6;
               --var7;
            } else if(3 == var5) {
               --var6;
            } else if(4 == var5) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(6 == var5) {
               ++var7;
            } else if(7 == var5) {
               ++var6;
               ++var7;
            }

            if(client.field_1534 * 929092845 == var1 && (-130212619 * var4.field_1077 < 527932474 || -2010358270 * var4.field_1076 < 1536 || var4.field_1077 * -483359587 >= -1581531953 || var4.field_1076 * 1248597615 >= 11776)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = var6 * 258210291;
               var4.field_1144 = var7 * -1980588164;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else if(2 == var3) {
            var5 = var0.method_361(4, (byte)41);
            var6 = var4.field_1112[0];
            var7 = var4.field_1126[0];
            if(0 == var5) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(2 == var5) {
               var7 -= 2;
            } else if(3 == var5) {
               ++var6;
               var7 -= 2;
            } else if(4 == var5) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(10 == var5) {
               var6 += 2;
               ++var7;
            } else if(11 == var5) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(13 == var5) {
               var7 += 2;
            } else if(14 == var5) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.field_1534 * 2084660 == var1 && (-130212619 * var4.field_1077 < -79475314 || 1248597615 * var4.field_1076 < 1536 || -1356034240 * var4.field_1077 >= 2062625349 || var4.field_1076 * 1248597615 >= 87980269)) {
               var4.method_1835(var6, var7);
               var4.field_1168 = false;
            } else if(var2) {
               var4.field_1168 = true;
               var4.field_1155 = 258210291 * var6;
               var4.field_1144 = 1208318406 * var7;
            } else {
               var4.field_1168 = false;
               var4.method_1846(var6, var7, field_2311[var1], 2070611264);
            }

         } else {
            var5 = var0.method_361(1, (byte)-80);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method_361(12, (byte)-64);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 648941775;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & -1765115508;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var4.field_1112[0] + var8;
               var11 = var9 + var4.field_1126[0];
               if(var1 == client.field_1534 * 929092845 && (-130212619 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 1536 || 1532027795 * var4.field_1077 >= 11776 || var4.field_1076 * 1248597615 >= 1655069616)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = 1745288143 * var10;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = 1571462451 * (byte)(671262203 * var4.field_1163 + var7 & 3);
               if(929092845 * client.field_1534 == var1) {
                  class_115.field_1289 = var4.field_1163 * -1993331315;
               }

            } else {
               var6 = var0.method_361(30, (byte)12);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 2034333614;
               var10 = (var4.field_1112[0] + 725123434 * class_243.field_2700 + var8 & -592660353) - 697161691 * class_243.field_2700;
               var11 = (var4.field_1126[0] + -1638828502 * class_154.field_1929 + var9 & -787338921) - -27903763 * class_154.field_1929;
               if(var1 == -2093574516 * client.field_1534 && (-130212619 * var4.field_1077 < 1536 || var4.field_1076 * 1248597615 < 1536 || 885090051 * var4.field_1077 >= 11776 || var4.field_1076 * 1697280428 >= 254805490)) {
                  var4.method_1835(var10, var11);
                  var4.field_1168 = false;
               } else if(var2) {
                  var4.field_1168 = true;
                  var4.field_1155 = var10 * -721403648;
                  var4.field_1144 = var11 * 770404467;
               } else {
                  var4.field_1168 = false;
                  var4.method_1846(var10, var11, field_2311[var1], 2070611264);
               }

               var4.field_1163 = (byte)(var4.field_1163 * 790283701 + var7 & 3) * 1571462451;
               if(var1 == 929092845 * client.field_1534) {
                  class_115.field_1289 = -1993331315 * var4.field_1163;
               }

            }
         }
      }
   }

   // $FF: renamed from: s (nb) void
   static final void method_3981(class_29 var0) {
      var0.method_358();
      int var1 = 929092845 * client.field_1534;
      class_100[] var10000 = client.field_1605;
      class_100 var10002 = new class_100();
      class_100 var2 = class_164.field_2044 = var10000[var1] = var10002;
      var2.field_1142 = var1 * -1619133141;
      int var3 = var0.method_361(30, (byte)48);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field_1112[0] = var5 - class_243.field_2700 * 697161691;
      var2.field_1077 = ((var2.field_1112[0] << 7) + (var2.method_1833(-1146692006) << 6)) * -1369591971;
      var2.field_1126[0] = var6 - class_154.field_1929 * -27903763;
      var2.field_1076 = ((var2.field_1126[0] << 7) + (var2.method_1833(-409595243) << 6)) * -1747711857;
      class_115.field_1289 = (var2.field_1163 = 1571462451 * var4) * -1993331315;
      if(field_2312[var1] != null) {
         var2.method_1824(field_2312[var1], (byte)1);
      }

      field_2313 = 0;
      field_2318[(field_2313 += 1909342277) * -1143549299 - 1] = var1;
      field_2308[var1] = 0;
      field_2315 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method_361(18, (byte)75);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            field_2309[var7] = (var9 << 28) + (var10 << 14) + var11;
            field_2310[var7] = 0;
            field_2317[var7] = -1;
            field_2316[(field_2315 += -262660203) * -1936837699 - 1] = var7;
            field_2308[var7] = 0;
         }
      }

      var0.method_362();
   }

   // $FF: renamed from: z (nb, int) boolean
   static boolean method_3982(class_29 var0, int var1) {
      int var2 = var0.method_361(2, (byte)108);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if(0 == var2) {
         if(var0.method_361(1, (byte)-55) != 0) {
            class_86.method_1481(var0, var1, -1714213888);
         }

         var3 = var0.method_361(13, (byte)27);
         var4 = var0.method_361(13, (byte)-15);
         boolean var11 = var0.method_361(1, (byte)-34) == 1;
         if(var11) {
            field_2314[(field_2320 += 1046658217) * 450800766 - 1] = var1;
         }

         if(client.field_1605[var1] != null) {
            throw new RuntimeException();
         } else {
            class_100[] var10000 = client.field_1605;
            class_100 var10002 = new class_100();
            class_100 var12 = var10000[var1] = var10002;
            var12.field_1142 = var1 * -1619133141;
            if(null != field_2312[var1]) {
               var12.method_1824(field_2312[var1], (byte)1);
            }

            var12.field_1106 = field_2310[var1] * 76755300;
            var12.field_1128 = field_2317[var1] * -80551589;
            var7 = field_2309[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 51861419;
            var10 = var7 & 255;
            var12.field_1086[0] = field_2311[var1];
            var12.field_1163 = 1114615887 * (byte)var8;
            var12.method_1835((var9 << 13) + var3 - -1365156253 * class_243.field_2700, (var10 << 13) + var4 - class_154.field_1929 * -27903763);
            var12.field_1168 = false;
            return true;
         }
      } else if(1 == var2) {
         var3 = var0.method_361(2, (byte)27);
         var4 = field_2309[var1];
         field_2309[var1] = (var4 & 1164361642) + ((var3 + (var4 >> 28) & 3) << 28);
         return false;
      } else {
         int var5;
         int var6;
         if(2 == var2) {
            var3 = var0.method_361(5, (byte)92);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = field_2309[var1];
            var7 = var4 + (var6 >> 28) & 3;
            var8 = var6 >> 14 & -476892074;
            var9 = var6 & 255;
            if(var5 == 0) {
               --var8;
               --var9;
            }

            if(1 == var5) {
               --var9;
            }

            if(2 == var5) {
               ++var8;
               --var9;
            }

            if(var5 == 3) {
               --var8;
            }

            if(var5 == 4) {
               ++var8;
            }

            if(5 == var5) {
               --var8;
               ++var9;
            }

            if(6 == var5) {
               ++var9;
            }

            if(7 == var5) {
               ++var8;
               ++var9;
            }

            field_2309[var1] = var9 + (var8 << 14) + (var7 << 28);
            return false;
         } else {
            var3 = var0.method_361(18, (byte)19);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 1646917758;
            var6 = var3 & 255;
            var7 = field_2309[var1];
            var8 = var4 + (var7 >> 28) & 3;
            var9 = (var7 >> 14) + var5 & 255;
            var10 = var6 + var7 & 1547659754;
            field_2309[var1] = var10 + (var9 << 14) + (var8 << 28);
            return false;
         }
      }
   }

   // $FF: renamed from: w (nb, int) boolean
   static boolean method_3983(class_29 var0, int var1) {
      int var2 = var0.method_361(2, (byte)67);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if(0 == var2) {
         if(var0.method_361(1, (byte)13) != 0) {
            class_86.method_1481(var0, var1, -123243562);
         }

         var3 = var0.method_361(13, (byte)6);
         var4 = var0.method_361(13, (byte)46);
         boolean var11 = var0.method_361(1, (byte)-98) == 1;
         if(var11) {
            field_2314[(field_2320 += -1575538987) * 1204511982 - 1] = var1;
         }

         if(client.field_1605[var1] != null) {
            throw new RuntimeException();
         } else {
            class_100[] var10000 = client.field_1605;
            class_100 var10002 = new class_100();
            class_100 var12 = var10000[var1] = var10002;
            var12.field_1142 = var1 * -1619133141;
            if(null != field_2312[var1]) {
               var12.method_1824(field_2312[var1], (byte)1);
            }

            var12.field_1106 = field_2310[var1] * -87192211;
            var12.field_1128 = field_2317[var1] * -187990533;
            var7 = field_2309[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & -1744446476;
            var10 = var7 & -1094605854;
            var12.field_1086[0] = field_2311[var1];
            var12.field_1163 = 1571462451 * (byte)var8;
            var12.method_1835((var9 << 13) + var3 - 2115467981 * class_243.field_2700, (var10 << 13) + var4 - class_154.field_1929 * -332526646);
            var12.field_1168 = false;
            return true;
         }
      } else if(1 == var2) {
         var3 = var0.method_361(2, (byte)21);
         var4 = field_2309[var1];
         field_2309[var1] = (var4 & -1822708900) + ((var3 + (var4 >> 28) & 3) << 28);
         return false;
      } else {
         int var5;
         int var6;
         if(2 == var2) {
            var3 = var0.method_361(5, (byte)8);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = field_2309[var1];
            var7 = var4 + (var6 >> 28) & 3;
            var8 = var6 >> 14 & 909975539;
            var9 = var6 & -789797951;
            if(var5 == 0) {
               --var8;
               --var9;
            }

            if(1 == var5) {
               --var9;
            }

            if(2 == var5) {
               ++var8;
               --var9;
            }

            if(var5 == 3) {
               --var8;
            }

            if(var5 == 4) {
               ++var8;
            }

            if(5 == var5) {
               --var8;
               ++var9;
            }

            if(6 == var5) {
               ++var9;
            }

            if(7 == var5) {
               ++var8;
               ++var9;
            }

            field_2309[var1] = var9 + (var8 << 14) + (var7 << 28);
            return false;
         } else {
            var3 = var0.method_361(18, (byte)-24);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var6 = var3 & 1181799406;
            var7 = field_2309[var1];
            var8 = var4 + (var7 >> 28) & 3;
            var9 = (var7 >> 14) + var5 & 255;
            var10 = var6 + var7 & 604955746;
            field_2309[var1] = var10 + (var9 << 14) + (var8 << 28);
            return false;
         }
      }
   }

   // $FF: renamed from: t () void
   static void method_3984() {
      field_2313 = 0;

      for(int var0 = 0; var0 < -1619503435; ++var0) {
         field_2312[var0] = null;
         field_2311[var0] = 1;
      }

   }

   // $FF: renamed from: e (nb) void
   static final void method_3985(class_29 var0) {
      int var1 = 0;
      var0.method_358();

      int var2;
      int var3;
      int var4;
      int var6;
      int var7;
      for(var2 = 0; var2 < field_2313 * -1143549299; ++var2) {
         var3 = field_2318[var2];
         if((field_2308[var3] & 1) == 0) {
            if(var1 > 0) {
               --var1;
               field_2308[var3] = (byte)(field_2308[var3] | 2);
            } else {
               var4 = var0.method_361(1, (byte)17);
               if(var4 == 0) {
                  var6 = var0.method_361(2, (byte)-44);
                  if(var6 == 0) {
                     var7 = 0;
                  } else if(1 == var6) {
                     var7 = var0.method_361(5, (byte)-36);
                  } else if(2 == var6) {
                     var7 = var0.method_361(8, (byte)-7);
                  } else {
                     var7 = var0.method_361(11, (byte)21);
                  }

                  var1 = var7;
                  field_2308[var3] = (byte)(field_2308[var3] | 2);
               } else {
                  class_80.method_1337(var0, var3, (byte)37);
               }
            }
         }
      }

      var0.method_362();
      if(0 != var1) {
         throw new RuntimeException();
      } else {
         var0.method_358();

         for(var2 = 0; var2 < -1143549299 * field_2313; ++var2) {
            var3 = field_2318[var2];
            if(0 != (field_2308[var3] & 1)) {
               if(var1 > 0) {
                  --var1;
                  field_2308[var3] = (byte)(field_2308[var3] | 2);
               } else {
                  var4 = var0.method_361(1, (byte)25);
                  if(0 == var4) {
                     var6 = var0.method_361(2, (byte)15);
                     if(var6 == 0) {
                        var7 = 0;
                     } else if(var6 == 1) {
                        var7 = var0.method_361(5, (byte)17);
                     } else if(var6 == 2) {
                        var7 = var0.method_361(8, (byte)55);
                     } else {
                        var7 = var0.method_361(11, (byte)-33);
                     }

                     var1 = var7;
                     field_2308[var3] = (byte)(field_2308[var3] | 2);
                  } else {
                     class_80.method_1337(var0, var3, (byte)21);
                  }
               }
            }
         }

         var0.method_362();
         if(var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.method_358();

            for(var2 = 0; var2 < field_2315 * -1936837699; ++var2) {
               var3 = field_2316[var2];
               if(0 != (field_2308[var3] & 1)) {
                  if(var1 > 0) {
                     --var1;
                     field_2308[var3] = (byte)(field_2308[var3] | 2);
                  } else {
                     var4 = var0.method_361(1, (byte)-10);
                     if(0 == var4) {
                        var6 = var0.method_361(2, (byte)-40);
                        if(var6 == 0) {
                           var7 = 0;
                        } else if(1 == var6) {
                           var7 = var0.method_361(5, (byte)-9);
                        } else if(2 == var6) {
                           var7 = var0.method_361(8, (byte)69);
                        } else {
                           var7 = var0.method_361(11, (byte)26);
                        }

                        var1 = var7;
                        field_2308[var3] = (byte)(field_2308[var3] | 2);
                     } else if(class_86.method_1481(var0, var3, 855178486)) {
                        field_2308[var3] = (byte)(field_2308[var3] | 2);
                     }
                  }
               }
            }

            var0.method_362();
            if(var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.method_358();

               for(var2 = 0; var2 < field_2315 * -1936837699; ++var2) {
                  var3 = field_2316[var2];
                  if(0 == (field_2308[var3] & 1)) {
                     if(var1 > 0) {
                        --var1;
                        field_2308[var3] = (byte)(field_2308[var3] | 2);
                     } else {
                        var4 = var0.method_361(1, (byte)25);
                        if(var4 == 0) {
                           var6 = var0.method_361(2, (byte)39);
                           if(0 == var6) {
                              var7 = 0;
                           } else if(1 == var6) {
                              var7 = var0.method_361(5, (byte)68);
                           } else if(var6 == 2) {
                              var7 = var0.method_361(8, (byte)-71);
                           } else {
                              var7 = var0.method_361(11, (byte)-49);
                           }

                           var1 = var7;
                           field_2308[var3] = (byte)(field_2308[var3] | 2);
                        } else if(class_86.method_1481(var0, var3, 488320512)) {
                           field_2308[var3] = (byte)(field_2308[var3] | 2);
                        }
                     }
                  }
               }

               var0.method_362();
               if(var1 != 0) {
                  throw new RuntimeException();
               } else {
                  field_2313 = 0;
                  field_2315 = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     field_2308[var2] = (byte)(field_2308[var2] >> 1);
                     class_100 var8 = client.field_1605[var2];
                     if(var8 != null) {
                        field_2318[(field_2313 += 1909342277) * -1143549299 - 1] = var2;
                     } else {
                        field_2316[(field_2315 += -262660203) * -1936837699 - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: q () void
   static void method_3986() {
      field_2313 = 0;

      for(int var0 = 0; var0 < 1136392; ++var0) {
         field_2312[var0] = null;
         field_2311[var0] = 1;
      }

   }

   // $FF: renamed from: e (int) int
   static final int method_3987() {
      try {
         return 1131754581 * class_255.field_2877;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: v (java.lang.String, boolean, boolean, int) void
   public static void method_3988(String var0, boolean var1, boolean var2, int var3) {
      try {
         if(var1) {
            if(var3 == -1129264655) {
               return;
            }

            if(!var2) {
               if(var3 == -1129264655) {
                  throw new IllegalStateException();
               }

               if(Desktop.isDesktopSupported()) {
                  if(var3 == -1129264655) {
                     throw new IllegalStateException();
                  }

                  if(Desktop.getDesktop().isSupported(Action.BROWSE)) {
                     try {
                        Desktop.getDesktop().browse(new URI(var0));
                        return;
                     } catch (Exception var5) {
                        ;
                     }
                  }
               }
            }

            if(class_136.field_1751.startsWith("win")) {
               if(var3 == -1129264655) {
                  throw new IllegalStateException();
               }

               if(!var2) {
                  if(var3 == -1129264655) {
                     throw new IllegalStateException();
                  }

                  class_283.method_5183(var0, 0);
                  return;
               }
            }

            if(class_136.field_1751.startsWith("mac")) {
               if(var3 == -1129264655) {
                  return;
               }

               class_90.method_1602(var0, 1, "openjs", 2094340190);
            } else {
               class_283.method_5183(var0, 2);
            }
         } else {
            class_283.method_5183(var0, 3);
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
