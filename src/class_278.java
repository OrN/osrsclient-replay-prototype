import java.nio.ByteBuffer;

// $FF: renamed from: if
public class class_278 extends class_277 {

   // $FF: renamed from: s int
   static int field_3224;
   // $FF: renamed from: v java.nio.ByteBuffer
   ByteBuffer field_3225;
   // $FF: renamed from: r byte[][][]
   static byte[][][] field_3226;


   // $FF: renamed from: o (byte[]) void
   void method_5143(byte[] var1) {
      this.field_3225 = ByteBuffer.allocateDirect(var1.length);
      this.field_3225.position(0);
      this.field_3225.put(var1);
   }

   // $FF: renamed from: f (byte) byte[]
   byte[] method_5132() {
      try {
         byte[] var2 = new byte[this.field_3225.capacity()];
         this.field_3225.position(0);
         this.field_3225.get(var2);
         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (byte[], byte) void
   void method_5134(byte[] var1) {
      try {
         this.field_3225 = ByteBuffer.allocateDirect(var1.length);
         this.field_3225.position(0);
         this.field_3225.put(var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: l () byte[]
   byte[] method_5133() {
      byte[] var1 = new byte[this.field_3225.capacity()];
      this.field_3225.position(0);
      this.field_3225.get(var1);
      return var1;
   }

   // $FF: renamed from: <init> () void
   class_278() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: u () byte[]
   byte[] method_5145() {
      byte[] var1 = new byte[this.field_3225.capacity()];
      this.field_3225.position(0);
      this.field_3225.get(var1);
      return var1;
   }

   // $FF: renamed from: s () byte[]
   byte[] method_5142() {
      byte[] var1 = new byte[this.field_3225.capacity()];
      this.field_3225.position(0);
      this.field_3225.get(var1);
      return var1;
   }

   // $FF: renamed from: c (byte[]) void
   void method_5141(byte[] var1) {
      this.field_3225 = ByteBuffer.allocateDirect(var1.length);
      this.field_3225.position(0);
      this.field_3225.put(var1);
   }

   // $FF: renamed from: f (jp, int, int, int, byte, boolean, byte) void
   static void method_5146(class_307 var0, int var1, int var2, int var3, byte var4, boolean var5, byte var6) {
      try {
         long var7 = (long)((var1 << 16) + var2);
         class_60 var9 = (class_60)class_314.field_3767.method_6523(var7);
         if(null != var9) {
            if(var6 < 1) {
               ;
            }
         } else {
            var9 = (class_60)class_314.field_3779.method_6523(var7);
            if(null != var9) {
               if(var6 < 1) {
                  ;
               }
            } else {
               var9 = (class_60)class_314.field_3781.method_6523(var7);
               if(var9 != null) {
                  if(var6 >= 1) {
                     throw new IllegalStateException();
                  } else {
                     if(var5) {
                        if(var6 >= 1) {
                           return;
                        }

                        var9.method_635();
                        class_314.field_3767.method_6525(var9, var7);
                        class_314.field_3773 -= 422170945;
                        class_314.field_3768 += -51966071;
                     }

                  }
               } else {
                  if(!var5) {
                     if(var6 >= 1) {
                        throw new IllegalStateException();
                     }

                     var9 = (class_60)class_314.field_3769.method_6523(var7);
                     if(null != var9) {
                        if(var6 >= 1) {
                           return;
                        }

                        return;
                     }
                  }

                  class_60 var10000 = new class_60();
                  var9 = var10000;
                  var9.field_473 = var0;
                  var9.field_474 = -1150578315 * var3;
                  var9.field_472 = var4;
                  if(var5) {
                     class_314.field_3767.method_6525(var9, var7);
                     class_314.field_3768 += -51966071;
                  } else {
                     class_314.field_3774.method_5611(var9);
                     class_314.field_3781.method_6525(var9, var7);
                     class_314.field_3773 += 422170945;
                  }

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: y (int, boolean, int, boolean, int) void
   static void method_5147(int var0, boolean var1, int var2, boolean var3, int var4) {
      try {
         if(class_166.field_2083 != null) {
            if(var4 != -1640664715) {
               throw new IllegalStateException();
            }

            class_362.method_6324(0, class_166.field_2083.length - 1, var0, var1, var2, var3, 848721482);
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: go (java.lang.String, boolean, int) void
   static final void method_5148(String var0, boolean var1, int var2) {
      try {
         if(!client.field_1589) {
            if(var2 != -1591335539) {
               throw new IllegalStateException();
            }
         } else {
            byte var3 = 4;
            int var4 = var3 + 6;
            int var5 = 6 + var3;
            int var6 = class_183.field_2251.method_866(var0, 250);
            int var7 = class_183.field_2251.method_867(var0, 250) * 13;
            class_65.method_681(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
            class_65.method_670(var4 - var3, var5 - var3, var3 + var3 + var6, var7 + var3 + var3, 16777215);
            class_183.field_2251.drawString(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            int var8 = var4 - var3;
            int var9 = var5 - var3;
            int var10 = var3 + var3 + var6;
            int var11 = var3 + var3 + var7;

            for(int var12 = 0; var12 < 257317803 * client.field_1646; ++var12) {
               if(client.field_1695[var12] + client.field_1539[var12] > var8 && client.field_1695[var12] < var10 + var8) {
                  if(var2 != -1591335539) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1632[var12] + client.field_1518[var12] > var9 && client.field_1518[var12] < var11 + var9) {
                     if(var2 != -1591335539) {
                        return;
                     }

                     client.field_1495[var12] = true;
                  }
               }
            }

            if(var1) {
               class_126.field_1370.method_3059(0, 0);
            } else {
               class_139.method_3045(var4, var5, var6, var7, -572457964);
            }

         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }
}
