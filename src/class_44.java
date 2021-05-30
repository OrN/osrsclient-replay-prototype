import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// $FF: renamed from: y
public class class_44 extends class_27 {

   // $FF: renamed from: b byte
   public byte field_316;
   // $FF: renamed from: n boolean
   boolean field_317;
   // $FF: renamed from: f java.util.List
   public List field_318;
   // $FF: renamed from: p long
   long field_319;
   // $FF: renamed from: v boolean
   boolean field_320;
   // $FF: renamed from: j java.lang.String
   public String field_321;
   // $FF: renamed from: r byte
   public byte field_322;
   // $FF: renamed from: c op
   static class_66 field_323;
   // $FF: renamed from: k int
   static final int field_324 = 19;
   // $FF: renamed from: y int[]
   int[] field_325;
   // $FF: renamed from: dg jp
   static class_307 field_326;
   // $FF: renamed from: ay int
   static final int field_327 = 58;
   // $FF: renamed from: ny int
   static int field_328;
   // $FF: renamed from: z int
   static final int field_329 = 1048576;


   // $FF: renamed from: o () int
   public int method_497() {
      return this.field_318.size();
   }

   // $FF: renamed from: v (int) int[]
   public int[] method_498(int var1) {
      try {
         if(null == this.field_325) {
            if(var1 <= -73329338) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.field_318.size()];
            this.field_325 = new int[this.field_318.size()];

            for(int var3 = 0; var3 < this.field_318.size(); this.field_325[var3] = var3++) {
               if(var1 <= -73329338) {
                  throw new IllegalStateException();
               }

               var2[var3] = ((class_178)this.field_318.get(var3)).field_2222;
            }

            class_175.method_3740(var2, this.field_325);
         }

         return this.field_325;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: b () int[]
   public int[] method_499() {
      if(null == this.field_325) {
         String[] var1 = new String[this.field_318.size()];
         this.field_325 = new int[this.field_318.size()];

         for(int var2 = 0; var2 < this.field_318.size(); this.field_325[var2] = var2++) {
            var1[var2] = ((class_178)this.field_318.get(var2)).field_2222;
         }

         class_175.method_3740(var1, this.field_325);
      }

      return this.field_325;
   }

   // $FF: renamed from: f (int, byte) void
   void method_500(int var1) {
      try {
         this.field_318.remove(var1);
         this.field_325 = null;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (byte) int
   public int method_501() {
      try {
         return this.field_318.size();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: l () int
   public int method_502() {
      return this.field_318.size();
   }

   // $FF: renamed from: j (nd, int) void
   void method_503(class_28 var1, int var2) {
      try {
         int var3 = var1.method_130();
         if((var3 & 1) != 0) {
            if(var2 <= -631068980) {
               throw new IllegalStateException();
            }

            this.field_320 = true;
         }

         if((var3 & 2) != 0) {
            this.field_317 = true;
         }

         int var4 = 2;
         if((var3 & 4) != 0) {
            var4 = var1.method_130();
         }

         this.field_9 = var1.method_136();
         this.field_319 = var1.method_136() * 1641196620496598251L;
         this.field_321 = var1.method_139(-391631059);
         var1.method_119(-39963121);
         this.field_316 = var1.method_131();
         this.field_322 = var1.method_131();
         int var5 = var1.method_132();
         if(var5 > 0) {
            this.field_318 = new ArrayList(var5);

            for(int var6 = 0; var6 < var5; ++var6) {
               class_178 var10000 = new class_178();
               class_178 var7 = var10000;
               if(this.field_320) {
                  if(var2 <= -631068980) {
                     throw new IllegalStateException();
                  }

                  var1.method_136();
               }

               if(this.field_317) {
                  if(var2 <= -631068980) {
                     throw new IllegalStateException();
                  }

                  var7.field_2222 = var1.method_139(-391631059);
               }

               var7.field_2221 = var1.method_131();
               var7.field_2217 = var1.method_132() * -811705383;
               if(var4 >= 3) {
                  if(var2 <= -631068980) {
                     throw new IllegalStateException();
                  }

                  var1.method_119(506460946);
               }

               this.field_318.add(var6, var7);
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: p (java.lang.String, int) int
   public int method_504(String var1, int var2) {
      try {
         if(!this.field_317) {
            if(var2 == 697161691) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("Displaynames not available");
            }
         } else {
            for(int var3 = 0; var3 < this.field_318.size(); ++var3) {
               if(var2 == 697161691) {
                  throw new IllegalStateException();
               }

               if(((class_178)this.field_318.get(var3)).field_2222.equalsIgnoreCase(var1)) {
                  if(var2 == 697161691) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: r () int[]
   public int[] method_505() {
      if(null == this.field_325) {
         String[] var1 = new String[this.field_318.size()];
         this.field_325 = new int[this.field_318.size()];

         for(int var2 = 0; var2 < this.field_318.size(); this.field_325[var2] = var2++) {
            var1[var2] = ((class_178)this.field_318.get(var2)).field_2222;
         }

         class_175.method_3740(var1, this.field_325);
      }

      return this.field_325;
   }

   // $FF: renamed from: c () int
   public int method_506() {
      return this.field_318.size();
   }

   // $FF: renamed from: d () int[]
   public int[] method_507() {
      if(null == this.field_325) {
         String[] var1 = new String[this.field_318.size()];
         this.field_325 = new int[this.field_318.size()];

         for(int var2 = 0; var2 < this.field_318.size(); this.field_325[var2] = var2++) {
            var1[var2] = ((class_178)this.field_318.get(var2)).field_2222;
         }

         class_175.method_3740(var1, this.field_325);
      }

      return this.field_325;
   }

   // $FF: renamed from: <init> (nd) void
   public class_44(class_28 var1) {
      super();
      try {
         this.field_317 = true;
         this.field_321 = null;
         this.method_503(var1, -104022179);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: u (int) void
   void method_509(int var1) {
      this.field_318.remove(var1);
      this.field_325 = null;
   }

   // $FF: renamed from: s (s) void
   void method_510(class_178 var1) {
      this.field_318.add(var1);
      this.field_325 = null;
   }

   // $FF: renamed from: ix (int, int, int, int, int, int, int) void
   static final void method_511(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var2 - var0;
         int var8 = var3 - var1;
         int var10000;
         if(var7 >= 0) {
            if(var6 == 1887275344) {
               return;
            }

            var10000 = var7;
         } else {
            var10000 = -var7;
         }

         int var9 = var10000;
         if(var8 >= 0) {
            if(var6 == 1887275344) {
               return;
            }

            var10000 = var8;
         } else {
            var10000 = -var8;
         }

         int var10 = var10000;
         int var11 = var9;
         if(var9 < var10) {
            if(var6 == 1887275344) {
               throw new IllegalStateException();
            }

            var11 = var10;
         }

         if(0 == var11) {
            if(var6 == 1887275344) {
               throw new IllegalStateException();
            }
         } else {
            int var12 = (var7 << 16) / var11;
            int var13 = (var8 << 16) / var11;
            if(var13 <= var12) {
               if(var6 == 1887275344) {
                  throw new IllegalStateException();
               }

               var12 = -var12;
            } else {
               var13 = -var13;
            }

            int var14 = var5 * var13 >> 17;
            int var15 = 1 + var5 * var13 >> 17;
            int var16 = var12 * var5 >> 17;
            int var17 = var12 * var5 + 1 >> 17;
            var0 -= class_65.field_489;
            var1 -= class_65.field_487;
            int var18 = var14 + var0;
            int var19 = var0 - var15;
            int var20 = var0 + var7 - var15;
            int var21 = var14 + var7 + var0;
            int var22 = var1 + var16;
            int var23 = var1 - var17;
            int var24 = var8 + var1 - var17;
            int var25 = var1 + var8 + var16;
            class_70.method_979(var18, var19, var20);
            class_70.method_1042(var22, var23, var24, var18, var19, var20, var4);
            class_70.method_979(var18, var20, var21);
            class_70.method_1042(var22, var24, var25, var18, var20, var21, var4);
         }
      } catch (RuntimeException var26) {
         throw class_223.method_4281(var26);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      new BitSet(65536);
   }

   // $FF: renamed from: e (java.lang.String) int
   public int method_513(String var1) {
      if(!this.field_317) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.field_318.size(); ++var2) {
            if(((class_178)this.field_318.get(var2)).field_2222.equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: g (java.lang.String) int
   public int method_514(String var1) {
      if(!this.field_317) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.field_318.size(); ++var2) {
            if(((class_178)this.field_318.get(var2)).field_2222.equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: a (nd) void
   void method_515(class_28 var1) {
      int var2 = var1.method_130();
      if((var2 & 1) != 0) {
         this.field_320 = true;
      }

      if((var2 & 2) != 0) {
         this.field_317 = true;
      }

      int var3 = 2;
      if((var2 & 4) != 0) {
         var3 = var1.method_130();
      }

      this.field_9 = var1.method_136();
      this.field_319 = var1.method_136() * 1641196620496598251L;
      this.field_321 = var1.method_139(-391631059);
      var1.method_119(1630026748);
      this.field_316 = var1.method_131();
      this.field_322 = var1.method_131();
      int var4 = var1.method_132();
      if(var4 > 0) {
         this.field_318 = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            class_178 var10000 = new class_178();
            class_178 var6 = var10000;
            if(this.field_320) {
               var1.method_136();
            }

            if(this.field_317) {
               var6.field_2222 = var1.method_139(-391631059);
            }

            var6.field_2221 = var1.method_131();
            var6.field_2217 = var1.method_132() * -811705383;
            if(var3 >= 3) {
               var1.method_119(1862166750);
            }

            this.field_318.add(var5, var6);
         }
      }

   }

   // $FF: renamed from: k (nd) void
   void method_516(class_28 var1) {
      int var2 = var1.method_130();
      if((var2 & 1) != 0) {
         this.field_320 = true;
      }

      if((var2 & 2) != 0) {
         this.field_317 = true;
      }

      int var3 = 2;
      if((var2 & 4) != 0) {
         var3 = var1.method_130();
      }

      this.field_9 = var1.method_136();
      this.field_319 = var1.method_136() * 1641196620496598251L;
      this.field_321 = var1.method_139(-391631059);
      var1.method_119(625358015);
      this.field_316 = var1.method_131();
      this.field_322 = var1.method_131();
      int var4 = var1.method_132();
      if(var4 > 0) {
         this.field_318 = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            class_178 var10000 = new class_178();
            class_178 var6 = var10000;
            if(this.field_320) {
               var1.method_136();
            }

            if(this.field_317) {
               var6.field_2222 = var1.method_139(-391631059);
            }

            var6.field_2221 = var1.method_131();
            var6.field_2217 = var1.method_132() * -811705383;
            if(var3 >= 3) {
               var1.method_119(-759128062);
            }

            this.field_318.add(var5, var6);
         }
      }

   }

   // $FF: renamed from: ae (int, cf, boolean, int) int
   static int method_517(int var0, int var3) {
      try {
         if(3700 != var0) {
            if(var3 <= -883278895) {
               throw new IllegalStateException();
            }

            if(var0 != 3701) {
               if(var0 == 3702) {
                  if(var3 <= -883278895) {
                     throw new IllegalStateException();
                  }

                  class_136.field_1752 += -1087727229;
                  return 1;
               }

               return 2;
            }

            if(var3 <= -883278895) {
               throw new IllegalStateException();
            }
         }

         class_136.field_1752 -= -1087727229;
         class_165.field_2054 -= 1647125333;
         return 1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (s, int) void
   void method_518(class_178 var1) {
      try {
         this.field_318.add(var1);
         this.field_325 = null;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
