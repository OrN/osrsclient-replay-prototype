
// $FF: renamed from: dq
public class class_202 implements class_14 {

   // $FF: renamed from: f dq
   public static final class_202 field_2362;
   // $FF: renamed from: n dq
   public static final class_202 field_2363;
   // $FF: renamed from: v dq
   public static final class_202 field_2364;
   // $FF: renamed from: y dq
   public static final class_202 field_2365;
   // $FF: renamed from: p int
   public final int field_2366;
   // $FF: renamed from: j int
   final int field_2367;
   // $FF: renamed from: ec jp
   static class_307 field_2368;
   // $FF: renamed from: x nd
   public static Buffer field_2369;


   // $FF: renamed from: <clinit> () void
   static {
      class_202 var10000 = new class_202(2, 0);
      field_2364 = var10000;
      var10000 = new class_202(1, 1);
      field_2363 = var10000;
      var10000 = new class_202(0, 2);
      field_2362 = var10000;
      var10000 = new class_202(3, 3);
      field_2365 = var10000;
   }

   // $FF: renamed from: v (int) int
   public int method_50() {
      try {
         return -1949743275 * this.field_2367;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return -1949743275 * this.field_2367;
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return -1949743275 * this.field_2367;
   }

   // $FF: renamed from: p (int, int, byte) int
   static int method_4072(int var0, int var1, byte var2) {
      try {
         long var3 = (long)(var1 + (var0 << 16));
         if(class_185.field_2260 != null) {
            if(var2 >= 7) {
               throw new IllegalStateException();
            }

            if(var3 == class_185.field_2260.field_9) {
               return -847787153 * class_154.field_1928.offset / (class_154.field_1928.data.length - class_185.field_2260.field_472) + 1;
            }

            if(var2 >= 7) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: ja (io, eq, int, int, boolean, int) void
   static final void method_4073(class_37 var0, class_80 var1, int var2, int var3, boolean var4, int var5) {
      try {
         byte var7;
         String var8;
         label73: {
            String[] var6 = var1.field_730;
            var7 = -1;
            var8 = null;
            if(null != var6) {
               if(var5 == 1696305671) {
                  throw new IllegalStateException();
               }

               if(null != var6[var3]) {
                  if(var5 == 1696305671) {
                     return;
                  }

                  if(var3 == 0) {
                     if(var5 == 1696305671) {
                        throw new IllegalStateException();
                     }

                     var7 = 33;
                  } else if(1 == var3) {
                     if(var5 == 1696305671) {
                        throw new IllegalStateException();
                     }

                     var7 = 34;
                  } else if(2 == var3) {
                     if(var5 == 1696305671) {
                        throw new IllegalStateException();
                     }

                     var7 = 35;
                  } else if(3 == var3) {
                     if(var5 == 1696305671) {
                        throw new IllegalStateException();
                     }

                     var7 = 36;
                  } else {
                     var7 = 37;
                  }

                  var8 = var6[var3];
                  break label73;
               }
            }

            if(4 == var3) {
               var7 = 37;
               var8 = class_305.field_3404;
            }
         }

         if(-1 != var7) {
            if(var5 == 1696305671) {
               throw new IllegalStateException();
            }

            if(var8 != null) {
               if(var5 == 1696305671) {
                  throw new IllegalStateException();
               }

               class_269.method_5041(var8, class_136.method_2958(16748608) + var1.field_707, var7, -882422617 * var1.field_748, var2, var0.field_101 * -1722455647, var4, -2076246411);
            }
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: <init> (int, int) void
   class_202(int var1, int var2) {
      super();
      try {
         this.field_2366 = var1 * 1084839573;
         this.field_2367 = -918520323 * var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: c (int) int
   static final int method_4075() {
      try {
         return class_255.field_2881 * 836373803;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
