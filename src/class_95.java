
// $FF: renamed from: cq
public final class class_95 extends class_91 {

   // $FF: renamed from: v int
   int field_1026;
   // $FF: renamed from: n int
   int field_1027;
   // $FF: renamed from: f int
   int field_1028;
   // $FF: renamed from: t fl
   class_72 field_1029;
   // $FF: renamed from: y int
   int field_1030;
   // $FF: renamed from: j int
   int field_1031;
   // $FF: renamed from: r int
   int field_1032;
   // $FF: renamed from: p int
   int field_1033;
   // $FF: renamed from: d int
   int field_1034;
   // $FF: renamed from: s int
   int field_1035;
   // $FF: renamed from: u int
   int field_1036;
   // $FF: renamed from: l boolean
   boolean field_1037;
   // $FF: renamed from: o double
   double field_1038;
   // $FF: renamed from: c double
   double field_1039;
   // $FF: renamed from: e double
   double field_1040;
   // $FF: renamed from: g double
   double field_1041;
   // $FF: renamed from: a double
   double field_1042;
   // $FF: renamed from: h int
   int field_1043;
   // $FF: renamed from: b int
   int field_1044;
   // $FF: renamed from: x double
   double field_1045;
   // $FF: renamed from: z int
   int field_1046;
   // $FF: renamed from: w int
   int field_1047;
   // $FF: renamed from: k double
   double field_1048;
   // $FF: renamed from: q int
   int field_1049;
   // $FF: renamed from: m double
   double field_1050;


   // $FF: renamed from: y (int, int, int, int) void
   final void method_1772(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.field_1037) {
         var5 = (double)(var1 - this.field_1028 * -1347198816);
         double var7 = (double)(var2 - 1770224161 * this.field_1030);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.field_1038 = (double)(this.field_1035 * -692803357) * var5 / var9 + (double)(1544300146 * this.field_1028);
         this.field_1039 = (double)(-692803357 * this.field_1035) * var7 / var9 + (double)(-1712598405 * this.field_1030);
         this.field_1040 = (double)(this.field_1033 * -273914244);
      }

      var5 = (double)(this.field_1044 * -1817230173 + 1 - var4);
      this.field_1041 = ((double)var1 - this.field_1038) / var5;
      this.field_1042 = ((double)var2 - this.field_1039) / var5;
      this.field_1048 = Math.sqrt(this.field_1041 * this.field_1041 + this.field_1042 * this.field_1042);
      if(!this.field_1037) {
         this.field_1050 = -this.field_1048 * Math.tan((double)(this.field_1034 * 1395984447) * 0.02454369D);
      }

      this.field_1045 = 2.0D * ((double)var3 - this.field_1040 - var5 * this.field_1050) / (var5 * var5);
   }

   // $FF: renamed from: f (int, int) void
   final void method_1773(int var1, int var2) {
      try {
         this.field_1037 = true;
         this.field_1038 += this.field_1041 * (double)var1;
         this.field_1039 += (double)var1 * this.field_1042;
         this.field_1040 += (double)var1 * this.field_1050 + (double)var1 * 0.5D * this.field_1045 * (double)var1;
         this.field_1050 += this.field_1045 * (double)var1;
         this.field_1046 = ((int)(Math.atan2(this.field_1041, this.field_1042) * 325.949D) + 1024 & 2047) * 416065089;
         this.field_1047 = ((int)(Math.atan2(this.field_1050, this.field_1048) * 325.949D) & 2047) * 218880961;
         if(this.field_1029 != null) {
            if(var2 != -602839745) {
               return;
            }

            this.field_1049 += var1 * 1849312653;

            while(1812825413 * this.field_1049 > this.field_1029.field_570[this.field_1043 * -774931897]) {
               if(var2 != -602839745) {
                  throw new IllegalStateException();
               }

               this.field_1049 -= 1849312653 * this.field_1029.field_570[this.field_1043 * -774931897];
               this.field_1043 += 981208951;
               if(-774931897 * this.field_1043 >= this.field_1029.field_568.length) {
                  if(var2 != -602839745) {
                     throw new IllegalStateException();
                  }

                  this.field_1043 -= 1978056625 * this.field_1029.field_567;
                  if(this.field_1043 * -774931897 >= 0) {
                     if(var2 != -602839745) {
                        throw new IllegalStateException();
                     }

                     if(-774931897 * this.field_1043 < this.field_1029.field_568.length) {
                        continue;
                     }

                     if(var2 != -602839745) {
                        throw new IllegalStateException();
                     }
                  }

                  this.field_1043 = 0;
               }
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> (int, int, int, int, int, int, int, int, int, int, int) void
   class_95(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      super();
      try {
         this.field_1037 = false;
         this.field_1043 = 0;
         this.field_1049 = 0;
         this.field_1026 = 1249763731 * var1;
         this.field_1027 = 158576389 * var2;
         this.field_1028 = var3 * 1411175783;
         this.field_1030 = -531199519 * var4;
         this.field_1033 = var5 * 1714237881;
         this.field_1032 = -292684525 * var6;
         this.field_1044 = -1335128309 * var7;
         this.field_1034 = var8 * -545069121;
         this.field_1035 = -840311605 * var9;
         this.field_1036 = -1681375353 * var10;
         this.field_1031 = 1064457313 * var11;
         this.field_1037 = false;
         int var12 = class_84.method_1417(this.field_1026 * 914973851, (short)-26912).field_683 * -814046371;
         if(-1 != var12) {
            this.field_1029 = class_162.method_3412(var12, -1137475997);
         } else {
            this.field_1029 = null;
         }

      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: n (byte) gr
   protected final class_92 method_1609(byte var1) {
      try {
         class_78 var2 = class_84.method_1417(914973851 * this.field_1026, (short)-4845);
         class_92 var3 = var2.method_1226(this.field_1043 * -774931897, (byte)50);
         if(var3 == null) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            var3.method_1631(1708799041 * this.field_1047);
            return var3;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p () gr
   protected final class_92 method_1613() {
      class_78 var1 = class_84.method_1417(914973851 * this.field_1026, (short)15380);
      class_92 var2 = var1.method_1226(this.field_1043 * -774931897, (byte)5);
      if(var2 == null) {
         return null;
      } else {
         var2.method_1631(1708799041 * this.field_1047);
         return var2;
      }
   }

   // $FF: renamed from: r () gr
   protected final class_92 method_1610() {
      class_78 var1 = class_84.method_1417(914973851 * this.field_1026, (short)7946);
      class_92 var2 = var1.method_1226(this.field_1043 * -1771370482, (byte)91);
      if(var2 == null) {
         return null;
      } else {
         var2.method_1631(-341791072 * this.field_1047);
         return var2;
      }
   }

   // $FF: renamed from: v (int, int, int, int, int) void
   final void method_1775(int var1, int var2, int var3, int var4, int var5) {
      try {
         double var6;
         if(!this.field_1037) {
            if(var5 == -199121182) {
               throw new IllegalStateException();
            }

            var6 = (double)(var1 - this.field_1028 * 1975154263);
            double var8 = (double)(var2 - 1770224161 * this.field_1030);
            double var10 = Math.sqrt(var8 * var8 + var6 * var6);
            this.field_1038 = (double)(this.field_1035 * -692803357) * var6 / var10 + (double)(1975154263 * this.field_1028);
            this.field_1039 = (double)(-692803357 * this.field_1035) * var8 / var10 + (double)(1770224161 * this.field_1030);
            this.field_1040 = (double)(this.field_1033 * 1880458377);
         }

         var6 = (double)(this.field_1044 * -1817230173 + 1 - var4);
         this.field_1041 = ((double)var1 - this.field_1038) / var6;
         this.field_1042 = ((double)var2 - this.field_1039) / var6;
         this.field_1048 = Math.sqrt(this.field_1041 * this.field_1041 + this.field_1042 * this.field_1042);
         if(!this.field_1037) {
            if(var5 == -199121182) {
               throw new IllegalStateException();
            }

            this.field_1050 = -this.field_1048 * Math.tan((double)(this.field_1034 * 1395984447) * 0.02454369D);
         }

         this.field_1045 = 2.0D * ((double)var3 - this.field_1040 - var6 * this.field_1050) / (var6 * var6);
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: j () gr
   protected final class_92 method_1608() {
      class_78 var1 = class_84.method_1417(-618992582 * this.field_1026, (short)-14912);
      class_92 var2 = var1.method_1226(this.field_1043 * -774931897, (byte)21);
      if(var2 == null) {
         return null;
      } else {
         var2.method_1631(323071652 * this.field_1047);
         return var2;
      }
   }

   // $FF: renamed from: b (int, int, int, int) void
   final void method_1776(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.field_1037) {
         var5 = (double)(var1 - this.field_1028 * 1975154263);
         double var7 = (double)(var2 - 1770224161 * this.field_1030);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.field_1038 = (double)(this.field_1035 * -692803357) * var5 / var9 + (double)(1975154263 * this.field_1028);
         this.field_1039 = (double)(-692803357 * this.field_1035) * var7 / var9 + (double)(1770224161 * this.field_1030);
         this.field_1040 = (double)(this.field_1033 * 1880458377);
      }

      var5 = (double)(this.field_1044 * -1817230173 + 1 - var4);
      this.field_1041 = ((double)var1 - this.field_1038) / var5;
      this.field_1042 = ((double)var2 - this.field_1039) / var5;
      this.field_1048 = Math.sqrt(this.field_1041 * this.field_1041 + this.field_1042 * this.field_1042);
      if(!this.field_1037) {
         this.field_1050 = -this.field_1048 * Math.tan((double)(this.field_1034 * 1395984447) * 0.02454369D);
      }

      this.field_1045 = 2.0D * ((double)var3 - this.field_1040 - var5 * this.field_1050) / (var5 * var5);
   }

   // $FF: renamed from: d (int, int, int, int) void
   final void method_1777(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.field_1037) {
         var5 = (double)(var1 - this.field_1028 * 1975154263);
         double var7 = (double)(var2 - 1770224161 * this.field_1030);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.field_1038 = (double)(this.field_1035 * -692803357) * var5 / var9 + (double)(1975154263 * this.field_1028);
         this.field_1039 = (double)(-692803357 * this.field_1035) * var7 / var9 + (double)(1770224161 * this.field_1030);
         this.field_1040 = (double)(this.field_1033 * 1880458377);
      }

      var5 = (double)(this.field_1044 * -1817230173 + 1 - var4);
      this.field_1041 = ((double)var1 - this.field_1038) / var5;
      this.field_1042 = ((double)var2 - this.field_1039) / var5;
      this.field_1048 = Math.sqrt(this.field_1041 * this.field_1041 + this.field_1042 * this.field_1042);
      if(!this.field_1037) {
         this.field_1050 = -this.field_1048 * Math.tan((double)(this.field_1034 * 1395984447) * 0.02454369D);
      }

      this.field_1045 = 2.0D * ((double)var3 - this.field_1040 - var5 * this.field_1050) / (var5 * var5);
   }

   // $FF: renamed from: s (int) void
   final void method_1778(int var1) {
      this.field_1037 = true;
      this.field_1038 += this.field_1041 * (double)var1;
      this.field_1039 += (double)var1 * this.field_1042;
      this.field_1040 += (double)var1 * this.field_1050 + (double)var1 * 0.5D * this.field_1045 * (double)var1;
      this.field_1050 += this.field_1045 * (double)var1;
      this.field_1046 = ((int)(Math.atan2(this.field_1041, this.field_1042) * 325.949D) + 1024 & 2047) * 416065089;
      this.field_1047 = ((int)(Math.atan2(this.field_1050, this.field_1048) * 325.949D) & 2047) * 218880961;
      if(this.field_1029 != null) {
         this.field_1049 += var1 * 1849312653;

         while(1812825413 * this.field_1049 > this.field_1029.field_570[this.field_1043 * -774931897]) {
            this.field_1049 -= 1849312653 * this.field_1029.field_570[this.field_1043 * -774931897];
            this.field_1043 += 981208951;
            if(-774931897 * this.field_1043 >= this.field_1029.field_568.length) {
               this.field_1043 -= 1978056625 * this.field_1029.field_567;
               if(this.field_1043 * -774931897 < 0 || -774931897 * this.field_1043 >= this.field_1029.field_568.length) {
                  this.field_1043 = 0;
               }
            }
         }
      }

   }

   // $FF: renamed from: u (int) void
   final void method_1779(int var1) {
      this.field_1037 = true;
      this.field_1038 += this.field_1041 * (double)var1;
      this.field_1039 += (double)var1 * this.field_1042;
      this.field_1040 += (double)var1 * this.field_1050 + (double)var1 * 0.5D * this.field_1045 * (double)var1;
      this.field_1050 += this.field_1045 * (double)var1;
      this.field_1046 = ((int)(Math.atan2(this.field_1041, this.field_1042) * 325.949D) + 1305286432 & 2047) * 416065089;
      this.field_1047 = ((int)(Math.atan2(this.field_1050, this.field_1048) * 325.949D) & 2047) * 218880961;
      if(this.field_1029 != null) {
         this.field_1049 += var1 * 1849312653;

         while(1812825413 * this.field_1049 > this.field_1029.field_570[this.field_1043 * -774931897]) {
            this.field_1049 -= 1849312653 * this.field_1029.field_570[this.field_1043 * -774931897];
            this.field_1043 += 981208951;
            if(776363870 * this.field_1043 >= this.field_1029.field_568.length) {
               this.field_1043 -= 973208124 * this.field_1029.field_567;
               if(this.field_1043 * 1889149693 < 0 || -774931897 * this.field_1043 >= this.field_1029.field_568.length) {
                  this.field_1043 = 0;
               }
            }
         }
      }

   }

   // $FF: renamed from: v (int, int) ev
   public static class_76 method_1780(int var0, int var1) {
      try {
         class_76 var2 = (class_76)class_76.field_627.method_5065((long)var0);
         if(var2 != null) {
            if(var1 == -367428966) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_76.field_625.method_5381(32, var0);
            class_76 var10000 = new class_76();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == -367428966) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28(var3);
               var2.method_1158(var10001, 1040710174);
            }

            class_76.field_627.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
