
// $FF: renamed from: gf
public class class_42 extends class_27 {

   // $FF: renamed from: f int
   static final int field_295 = 2;
   // $FF: renamed from: v int
   static final int field_296 = 0;
   // $FF: renamed from: l int
   int field_297;
   // $FF: renamed from: y int
   static final int field_298 = 3;
   // $FF: renamed from: p int
   int field_299;
   // $FF: renamed from: n int
   static final int field_300 = 1;
   // $FF: renamed from: r int[]
   int[] field_301;
   // $FF: renamed from: b int[]
   int[] field_302;
   // $FF: renamed from: d int[]
   int[] field_303;
   // $FF: renamed from: e int[]
   static int[] field_304;
   // $FF: renamed from: u int
   int field_305;
   // $FF: renamed from: j boolean
   boolean field_306;
   // $FF: renamed from: o int[]
   int[] field_307;
   // $FF: renamed from: c boolean
   boolean field_308;
   // $FF: renamed from: s int[]
   int[] field_309;


   // $FF: renamed from: p (double, int, jv) boolean
   boolean method_483(double var1, int var3, class_306 var4) {
      int var5;
      for(var5 = 0; var5 < this.field_301.length; ++var5) {
         if(var4.method_5390(this.field_301[var5], 444746714) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field_307 = new int[var5];

      for(int var6 = 0; var6 < this.field_301.length; ++var6) {
         class_66 var7 = GameMouseListener.method_2903(var4, this.field_301[var6], (short)234);
         var7.method_738();
         byte[] var8 = var7.field_493;
         int[] var9 = var7.field_491;
         int var10 = this.field_309[var6];
         if((var10 & -16777216) == 16777216) {
            ;
         }

         if((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class_70.method_991(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field_302[var6 - 1];
         }

         if(var11 == 0) {
            if(var7.field_498 == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field_307[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field_498 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field_307[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if(var7.field_498 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field_307[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   // $FF: renamed from: v (double, int, jv) boolean
   boolean method_484(double var1, int var3, class_306 var4) {
      int var5;
      for(var5 = 0; var5 < this.field_301.length; ++var5) {
         if(var4.method_5390(this.field_301[var5], 444746714) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field_307 = new int[var5];

      for(int var6 = 0; var6 < this.field_301.length; ++var6) {
         class_66 var7 = GameMouseListener.method_2903(var4, this.field_301[var6], (short)234);
         var7.method_738();
         byte[] var8 = var7.field_493;
         int[] var9 = var7.field_491;
         int var10 = this.field_309[var6];
         if((var10 & -16777216) == 16777216) {
            ;
         }

         if((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class_70.method_991(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field_302[var6 - 1];
         }

         if(var11 == 0) {
            if(var7.field_498 == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field_307[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field_498 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field_307[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if(var7.field_498 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field_307[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   // $FF: renamed from: f (int) void
   void method_485(int var1) {
      if(this.field_307 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.field_305 == 1 || this.field_305 == 3) {
            if(field_304 == null || field_304.length < this.field_307.length) {
               field_304 = new int[this.field_307.length];
            }

            if(this.field_307.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field_307.length;
            var4 = var2 * var1 * this.field_297;
            var5 = var3 - 1;
            if(this.field_305 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field_304[var6] = this.field_307[var7];
            }

            var10 = this.field_307;
            this.field_307 = field_304;
            field_304 = var10;
         }

         if(this.field_305 == 2 || this.field_305 == 4) {
            if(field_304 == null || field_304.length < this.field_307.length) {
               field_304 = new int[this.field_307.length];
            }

            if(this.field_307.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field_307.length;
            var4 = var1 * this.field_297;
            var5 = var2 - 1;
            if(this.field_305 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field_304[var8] = this.field_307[var9];
               }
            }

            var10 = this.field_307;
            this.field_307 = field_304;
            field_304 = var10;
         }

      }
   }

   // $FF: renamed from: <init> (nd) void
   class_42(Buffer var1) {
      super();
      this.field_308 = false;
      this.field_299 = var1.readShort();
      this.field_306 = var1.readUnsignedByte() == 1;
      int var2 = var1.readUnsignedByte();
      if(var2 >= 1 && var2 <= 4) {
         this.field_301 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field_301[var3] = var1.readShort();
         }

         if(var2 > 1) {
            this.field_302 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field_302[var3] = var1.readUnsignedByte();
            }
         }

         if(var2 > 1) {
            this.field_303 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field_303[var3] = var1.readUnsignedByte();
            }
         }

         this.field_309 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field_309[var3] = var1.readInt();
         }

         this.field_305 = var1.readUnsignedByte();
         this.field_297 = var1.readUnsignedByte();
         this.field_307 = null;
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: y (double, int, jv) boolean
   boolean method_487(double var1, int var3, class_306 var4) {
      int var5;
      for(var5 = 0; var5 < this.field_301.length; ++var5) {
         if(var4.method_5390(this.field_301[var5], 444746714) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field_307 = new int[var5];

      for(int var6 = 0; var6 < this.field_301.length; ++var6) {
         class_66 var7 = GameMouseListener.method_2903(var4, this.field_301[var6], (short)234);
         var7.method_738();
         byte[] var8 = var7.field_493;
         int[] var9 = var7.field_491;
         int var10 = this.field_309[var6];
         if((var10 & -2051793363) == 1792728875) {
            ;
         }

         if((var10 & -903416846) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -1838203003) == 50331648) {
            var11 = var10 & -2041927900;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class_70.method_991(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field_302[var6 - 1];
         }

         if(var11 == 0) {
            if(var7.field_498 == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field_307[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field_498 == -1324498238 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field_307[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if(var7.field_498 != -1407599396 || var3 != 806994471) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field_307[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   // $FF: renamed from: r () void
   void method_488() {
      this.field_307 = null;
   }

   // $FF: renamed from: j () void
   void method_489() {
      this.field_307 = null;
   }

   // $FF: renamed from: n () void
   void method_490() {
      this.field_307 = null;
   }

   // $FF: renamed from: b (int) void
   void method_491(int var1) {
      if(this.field_307 != null) {
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.field_305 == 1 || this.field_305 == 3) {
            if(field_304 == null || field_304.length < this.field_307.length) {
               field_304 = new int[this.field_307.length];
            }

            if(this.field_307.length == -1597722041) {
               var2 = 64;
            } else {
               var2 = -1211090583;
            }

            var3 = this.field_307.length;
            var4 = var2 * var1 * this.field_297;
            var5 = var3 - 1;
            if(this.field_305 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field_304[var6] = this.field_307[var7];
            }

            var10 = this.field_307;
            this.field_307 = field_304;
            field_304 = var10;
         }

         if(this.field_305 == 2 || this.field_305 == 4) {
            if(field_304 == null || field_304.length < this.field_307.length) {
               field_304 = new int[this.field_307.length];
            }

            if(this.field_307.length == 225183522) {
               var2 = 1070657887;
            } else {
               var2 = 1772194692;
            }

            var3 = this.field_307.length;
            var4 = var1 * this.field_297;
            var5 = var2 - 1;
            if(this.field_305 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field_304[var8] = this.field_307[var9];
               }
            }

            var10 = this.field_307;
            this.field_307 = field_304;
            field_304 = var10;
         }

      }
   }
}
