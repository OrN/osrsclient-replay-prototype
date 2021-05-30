
// $FF: renamed from: kd
public class class_318 {

   // $FF: renamed from: r int[]
   public static int[] field_3787;
   // $FF: renamed from: n char[]
   static char[] field_3788;
   // $FF: renamed from: v char[]
   public static char[] field_3789;
   // $FF: renamed from: f char[]
   static char[] field_3790;
   // $FF: renamed from: bl int
   static final int field_3791 = 71;
   // $FF: renamed from: y int[]
   static int[] field_3792;


   // $FF: renamed from: fn (java.lang.String, int) void
   static final void method_5656(String var0, int var1) {
      try {
         boolean var10001;
         if(var0.equalsIgnoreCase("toggleroof")) {
            if(!class_87.field_852.field_2117) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            class_87.field_852.field_2117 = var10001;
            class_94.method_1771(-1829875279);
            if(class_87.field_852.field_2117) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               class_149.method_3135(99, "", "Roofs are now all hidden");
            } else {
               class_149.method_3135(99, "", "Roofs will only be removed selectively");
            }
         }

         boolean var10000;
         if(var0.equalsIgnoreCase("displayfps")) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            if(!client.field_1431) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.field_1431 = var10000;
         }

         if(var0.equalsIgnoreCase("renderself")) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            if(!client.field_1536) {
               if(var1 <= -61946015) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.field_1536 = var10000;
         }

         if(var0.equalsIgnoreCase("mouseovertext")) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            client.field_1565 = !client.field_1565;
         }

         if(-816484905 * client.field_1586 >= 2) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            if(var0.equalsIgnoreCase("errortest")) {
               if(var1 <= -61946015) {
                  return;
               }

               throw new RuntimeException();
            }

            if(var0.equalsIgnoreCase("showcoord")) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               if(!class_287.field_3278.field_4068) {
                  if(var1 <= -61946015) {
                     return;
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               class_287.field_3278.field_4068 = var10001;
            }

            if(var0.equalsIgnoreCase("fpson")) {
               client.field_1431 = true;
            }

            if(var0.equalsIgnoreCase("fpsoff")) {
               client.field_1431 = false;
            }

            if(var0.equalsIgnoreCase("gc")) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               System.gc();
            }

            if(var0.equalsIgnoreCase("clientdrop")) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               class_60.method_638(-552402310);
            }
         }

         class_40 var2 = class_112.method_2238(class_266.field_3084, client.field_1463.field_2384, (byte)8);
         var2.field_263.method_210(var0.length() + 1);
         var2.field_263.method_120(var0);
         client.field_1463.method_4079(var2);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3789 = new char[64];

      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field_3789[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field_3789[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field_3789[var0] = (char)(48 + var0 - 52);
      }

      field_3789[62] = 43;
      field_3789[63] = 47;
      field_3788 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field_3788[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field_3788[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field_3788[var0] = (char)(48 + var0 - 52);
      }

      field_3788[62] = 42;
      field_3788[63] = 45;
      field_3790 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field_3790[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field_3790[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field_3790[var0] = (char)(48 + var0 - 52);
      }

      field_3790[62] = 45;
      field_3790[63] = 95;
      field_3792 = new int[128];

      for(var0 = 0; var0 < field_3792.length; ++var0) {
         field_3792[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field_3792[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field_3792[var0] = 26 + (var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field_3792[var0] = var0 - 48 + 52;
      }

      int[] var2 = field_3792;
      field_3792[43] = 62;
      var2[42] = 62;
      int[] var1 = field_3792;
      field_3792[47] = 63;
      var1[45] = 63;
   }

   // $FF: renamed from: <init> () void
   class_318() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
