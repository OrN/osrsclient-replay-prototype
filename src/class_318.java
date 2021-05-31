
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
    // $FF: renamed from: y int[]
   static int[] field_3792;


   // $FF: renamed from: fn (java.lang.String, int) void
   static final void method_5656(String command, int var1) {
      try {
         boolean var10001;
         if(command.equalsIgnoreCase("toggleroof")) {
            if(!class_87.preferences.roofsHidden) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            class_87.preferences.roofsHidden = var10001;
            class_94.savePreferences(-1829875279);
            if(class_87.preferences.roofsHidden) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               class_149.method_3135(99, "", "Roofs are now all hidden");
            } else {
               class_149.method_3135(99, "", "Roofs will only be removed selectively");
            }
         }

         boolean var10000;
         if(command.equalsIgnoreCase("displayfps")) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            if(!client.showFPS) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.showFPS = var10000;
         }

         if(command.equalsIgnoreCase("renderself")) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            if(!client.renderSelf) {
               if(var1 <= -61946015) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.renderSelf = var10000;
         }

         if(command.equalsIgnoreCase("mouseovertext")) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            client.mouseoverText = !client.mouseoverText;
         }

         if(true) {
            if(var1 <= -61946015) {
               throw new IllegalStateException();
            }

            if(command.equalsIgnoreCase("errortest")) {
               if(var1 <= -61946015) {
                  return;
               }

               throw new RuntimeException();
            }

            if(command.equalsIgnoreCase("showcoord")) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               if(!class_287.field_3278.showCoords) {
                  if(var1 <= -61946015) {
                     return;
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               class_287.field_3278.showCoords = var10001;
            }

            if(command.equalsIgnoreCase("fpson")) {
               client.showFPS = true;
            }

            if(command.equalsIgnoreCase("fpsoff")) {
               client.showFPS = false;
            }

            if(command.equalsIgnoreCase("gc")) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               System.gc();
            }

            if(command.equalsIgnoreCase("clientdrop")) {
               if(var1 <= -61946015) {
                  throw new IllegalStateException();
               }

               class_60.method_638(-552402310);
            }
         }

         class_40 var2 = class_112.method_2238(class_266.field_3084, client.field_1463.isaac, (byte)8);
         var2.networkBuffer.writeByte(command.length() + 1);
         var2.networkBuffer.writeString(command);
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

}
