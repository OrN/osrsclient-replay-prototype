
// $FF: renamed from: jg
public class class_297 implements Runnable {

   // $FF: renamed from: e int
   static final int field_3356 = 12;
   // $FF: renamed from: y java.lang.Object
   static Object field_3357;
   // $FF: renamed from: f int
   static int field_3358;
   // $FF: renamed from: n kx
   public static class_335 field_3359;
   // $FF: renamed from: p java.lang.Thread
   static Thread field_3360;
   // $FF: renamed from: v kx
   public static class_335 field_3361;


   // $FF: renamed from: by () void
   public void method_5336() {
      try {
         while(true) {
            class_335 var2 = field_3361;
            class_35 var1;
            synchronized(field_3361) {
               var1 = (class_35)field_3361.method_5944();
            }

            Object var17;
            if(null != var1) {
               if(0 == var1.field_65 * -1287454433) {
                  var1.field_61.method_6200((int)var1.field_9, var1.field_62, var1.field_62.length, (byte)91);
                  var2 = field_3361;
                  synchronized(field_3361) {
                     var1.method_108();
                  }
               } else if(var1.field_65 * -1287454433 == 1) {
                  var1.field_62 = var1.field_61.method_6199((int)var1.field_9, (byte)1);
                  var2 = field_3361;
                  synchronized(field_3361) {
                     field_3359.method_5939(var1);
                  }
               }

               var17 = field_3357;
               synchronized(field_3357) {
                  if(2106150539 * field_3358 <= 1) {
                     field_3358 = 0;
                     field_3357.notifyAll();
                     return;
                  }

                  field_3358 = -2121242104;
               }
            } else {
               long var16 = 99L;

               try {
                  Thread.sleep(var16);
               } catch (InterruptedException var13) {
                  ;
               }

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var12) {
                  ;
               }

               var17 = field_3357;
               synchronized(field_3357) {
                  if(2106150539 * field_3358 <= 1) {
                     field_3358 = 0;
                     field_3357.notifyAll();
                     return;
                  }

                  field_3358 -= 884091171;
               }
            }
         }
      } catch (Exception var15) {
         class_308.method_5523((String)null, var15, 1937878776);
      }
   }

   public void run() {
      try {
         try {
            while(true) {
               class_335 var2 = field_3361;
               class_35 var1;
               synchronized(field_3361) {
                  var1 = (class_35)field_3361.method_5944();
               }

               Object var18;
               if(null != var1) {
                  if(0 == var1.field_65 * -1287454433) {
                     var1.field_61.method_6200((int)var1.field_9, var1.field_62, var1.field_62.length, (byte)77);
                     var2 = field_3361;
                     synchronized(field_3361) {
                        var1.method_108();
                     }
                  } else if(var1.field_65 * -1287454433 == 1) {
                     var1.field_62 = var1.field_61.method_6199((int)var1.field_9, (byte)1);
                     var2 = field_3361;
                     synchronized(field_3361) {
                        field_3359.method_5939(var1);
                     }
                  }

                  var18 = field_3357;
                  synchronized(field_3357) {
                     if(2106150539 * field_3358 <= 1) {
                        field_3358 = 0;
                        field_3357.notifyAll();
                        return;
                     }

                     field_3358 = -2121242104;
                  }
               } else {
                  long var17 = 99L;

                  try {
                     Thread.sleep(var17);
                  } catch (InterruptedException var13) {
                     ;
                  }

                  try {
                     Thread.sleep(1L);
                  } catch (InterruptedException var12) {
                     ;
                  }

                  var18 = field_3357;
                  synchronized(field_3357) {
                     if(2106150539 * field_3358 <= 1) {
                        field_3358 = 0;
                        field_3357.notifyAll();
                        return;
                     }

                     field_3358 -= 884091171;
                  }
               }
            }
         } catch (Exception var15) {
            class_308.method_5523((String)null, var15, 1980565479);
         }
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16);
      }
   }

   // $FF: renamed from: <init> () void
   class_297() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f () void
   public static void method_5338() {
      Object var0 = field_3357;
      synchronized(field_3357) {
         if(0 != -231881431 * field_3358) {
            field_3358 = 2045244616;

            try {
               field_3357.wait();
            } catch (InterruptedException var3) {
               ;
            }
         }

      }
   }

   // $FF: renamed from: bc () void
   public void method_5339() {
      try {
         while(true) {
            class_335 var2 = field_3361;
            class_35 var1;
            synchronized(field_3361) {
               var1 = (class_35)field_3361.method_5944();
            }

            Object var17;
            if(null != var1) {
               if(0 == var1.field_65 * -1287454433) {
                  var1.field_61.method_6200((int)var1.field_9, var1.field_62, var1.field_62.length, (byte)65);
                  var2 = field_3361;
                  synchronized(field_3361) {
                     var1.method_108();
                  }
               } else if(var1.field_65 * -1287454433 == 1) {
                  var1.field_62 = var1.field_61.method_6199((int)var1.field_9, (byte)1);
                  var2 = field_3361;
                  synchronized(field_3361) {
                     field_3359.method_5939(var1);
                  }
               }

               var17 = field_3357;
               synchronized(field_3357) {
                  if(2106150539 * field_3358 <= 1) {
                     field_3358 = 0;
                     field_3357.notifyAll();
                     return;
                  }

                  field_3358 = -2121242104;
               }
            } else {
               long var16 = 99L;

               try {
                  Thread.sleep(var16);
               } catch (InterruptedException var13) {
                  ;
               }

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var12) {
                  ;
               }

               var17 = field_3357;
               synchronized(field_3357) {
                  if(2106150539 * field_3358 <= 1) {
                     field_3358 = 0;
                     field_3357.notifyAll();
                     return;
                  }

                  field_3358 -= 884091171;
               }
            }
         }
      } catch (Exception var15) {
         class_308.method_5523((String)null, var15, 2111660077);
      }
   }

   // $FF: renamed from: n () void
   public static void method_5340() {
      Object var0 = field_3357;
      synchronized(field_3357) {
         if(0 != 2106150539 * field_3358) {
            field_3358 = 884091171;

            try {
               field_3357.wait();
            } catch (InterruptedException var3) {
               ;
            }
         }

      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_335 var10000 = new class_335();
      field_3361 = var10000;
      var10000 = new class_335();
      field_3359 = var10000;
      field_3358 = 0;
      field_3357 = new Object();
   }

   // $FF: renamed from: n (int, byte) void
   public static void method_5342(int var0) {
      try {
         class_131.field_1718 = var0 * 457540795;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
