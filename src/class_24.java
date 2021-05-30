
// $FF: renamed from: aa
public class class_24 {

   // $FF: renamed from: v int
   static final int field_1 = 22050;
   // $FF: renamed from: n bx[]
   class_159[] field_2;
   // $FF: renamed from: f int
   int field_3;
   // $FF: renamed from: y int
   int field_4;


   // $FF: renamed from: f () int
   public final int method_76() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field_2[var2] != null && this.field_2[var2].field_1980 / 20 < var1) {
            var1 = this.field_2[var2].field_1980 / 20;
         }
      }

      if(this.field_3 < this.field_4 && this.field_3 / 20 < var1) {
         var1 = this.field_3 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field_2[var2] != null) {
               this.field_2[var2].field_1980 -= var1 * 20;
            }
         }

         if(this.field_3 < this.field_4) {
            this.field_3 -= var1 * 20;
            this.field_4 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: <init> (nd) void
   class_24(class_28 var1) {
      super();
      this.field_2 = new class_159[10];

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method_130(-220672004);
         if(var3 != 0) {
            var1.field_15 -= -1025691571;
            class_159[] var10000 = this.field_2;
            class_159 var10002 = new class_159();
            var10000[var2] = var10002;
            this.field_2[var2].method_3308(var1);
         }
      }

      this.field_3 = var1.method_132((byte)-56);
      this.field_4 = var1.method_132((byte)-108);
   }

   // $FF: renamed from: n () au
   public class_110 method_78() {
      byte[] var1 = this.method_80();
      class_110 var10000 = new class_110(22050, var1, 22050 * this.field_3 / 1000, 22050 * this.field_4 / 1000);
      return var10000;
   }

   // $FF: renamed from: v (jv, int, int) aa
   public static class_24 method_79(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_28 var10002 = new class_28(var3);
         class_24 var10000 = new class_24(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: y () byte[]
   final byte[] method_80() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field_2[var2] != null && this.field_2[var2].field_1982 + this.field_2[var2].field_1980 > var1) {
            var1 = this.field_2[var2].field_1982 + this.field_2[var2].field_1980;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field_2[var4] != null) {
               int var5 = this.field_2[var4].field_1982 * 22050 / 1000;
               int var6 = this.field_2[var4].field_1980 * 22050 / 1000;
               int[] var7 = this.field_2[var4].method_3305(var5, this.field_2[var4].field_1982);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   // $FF: renamed from: p (jv, int, int) aa
   public static class_24 method_81(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_28 var10002 = new class_28(var3);
         class_24 var10000 = new class_24(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: d () int
   public final int method_82() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field_2[var2] != null && this.field_2[var2].field_1980 / 20 < var1) {
            var1 = this.field_2[var2].field_1980 / 20;
         }
      }

      if(this.field_3 < this.field_4 && this.field_3 / 20 < var1) {
         var1 = this.field_3 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field_2[var2] != null) {
               this.field_2[var2].field_1980 -= var1 * 20;
            }
         }

         if(this.field_3 < this.field_4) {
            this.field_3 -= var1 * 20;
            this.field_4 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: r () au
   public class_110 method_83() {
      byte[] var1 = this.method_80();
      class_110 var10000 = new class_110(22050, var1, 22050 * this.field_3 / 1000, 22050 * this.field_4 / 1000);
      return var10000;
   }

   // $FF: renamed from: b () int
   public final int method_84() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field_2[var2] != null && this.field_2[var2].field_1980 / 20 < var1) {
            var1 = this.field_2[var2].field_1980 / 20;
         }
      }

      if(this.field_3 < this.field_4 && this.field_3 / 20 < var1) {
         var1 = this.field_3 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field_2[var2] != null) {
               this.field_2[var2].field_1980 -= var1 * 20;
            }
         }

         if(this.field_3 < this.field_4) {
            this.field_3 -= var1 * 20;
            this.field_4 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: j () au
   public class_110 method_85() {
      byte[] var1 = this.method_80();
      class_110 var10000 = new class_110(-1354461772, var1, -798474884 * this.field_3 / -2045093041, -250265503 * this.field_4 / 6721421);
      return var10000;
   }

   // $FF: renamed from: s () byte[]
   final byte[] method_86() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field_2[var2] != null && this.field_2[var2].field_1982 + this.field_2[var2].field_1980 > var1) {
            var1 = this.field_2[var2].field_1982 + this.field_2[var2].field_1980;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field_2[var4] != null) {
               int var5 = this.field_2[var4].field_1982 * 22050 / 1000;
               int var6 = this.field_2[var4].field_1980 * 22050 / 1000;
               int[] var7 = this.field_2[var4].method_3305(var5, this.field_2[var4].field_1982);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }
}
