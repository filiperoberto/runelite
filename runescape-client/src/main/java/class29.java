import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public final class class29 {
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1965379499
   )
   int field432;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1247931113
   )
   int field433;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 767394683
   )
   int field434;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1560509743
   )
   int field435;
   final class41 this$0;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 1704259335
   )
   static int field436;
   @ObfuscatedName("fl")
   @ObfuscatedGetter(
      intValue = 1936797081
   )
   static int field437;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1342223579
   )
   public static int field438;

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "([LWidget;IIIIIIIII)V",
      garbageValue = "-287014025"
   )
   @Export("gameDraw")
   static final void gameDraw(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.method4833(var2, var3, var4, var5);
      class136.method2493();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Widget var10 = var0[var9];
         if(var10 != null && (var1 == var10.parentId || var1 == -1412584499 && var10 == Client.field1079)) {
            int var11;
            if(var8 == -1) {
               Client.widgetPositionX[Client.field1109] = var6 + var10.relativeX;
               Client.widgetPositionY[Client.field1109] = var7 + var10.relativeY;
               Client.widgetBoundsWidth[Client.field1109] = var10.width;
               Client.widgetBoundsHeight[Client.field1109] = var10.height;
               var11 = ++Client.field1109 - 1;
            } else {
               var11 = var8;
            }

            var10.boundsIndex = var11;
            var10.field2786 = Client.gameCycle;
            if(!var10.hasScript || !WorldMapType2.method510(var10)) {
               int var12;
               if(var10.contentType > 0) {
                  var12 = var10.contentType;
                  if(var12 == 324) {
                     if(Client.field993 == -1) {
                        Client.field993 = var10.spriteId;
                        Client.field1179 = var10.field2690 * -1;
                     }

                     if(Client.field1177.isFemale) {
                        var10.spriteId = Client.field993;
                     } else {
                        var10.spriteId = Client.field1179 * -1;
                     }
                  } else if(var12 == 325) {
                     if(Client.field993 == -1) {
                        Client.field993 = var10.spriteId;
                        Client.field1179 = var10.field2690 * -1;
                     }

                     if(Client.field1177.isFemale) {
                        var10.spriteId = Client.field1179 * -1;
                     } else {
                        var10.spriteId = Client.field993;
                     }
                  } else if(var12 == 327) {
                     var10.rotationX = 150;
                     var10.rotationZ = (int)(Math.sin((double)Client.gameCycle / 40.0D) * 256.0D) & 2047;
                     var10.modelType = 5;
                     var10.modelId = 0;
                  } else if(var12 == 328) {
                     var10.rotationX = 150;
                     var10.rotationZ = (int)(Math.sin((double)Client.gameCycle / 40.0D) * 256.0D) & 2047;
                     var10.modelType = 5;
                     var10.modelId = 1;
                  }
               }

               var12 = var6 + var10.relativeX;
               int var13 = var7 + var10.relativeY;
               int var14 = var10.opacity;
               int var15;
               int var16;
               if(var10 == Client.field1079) {
                  if(var1 != -1412584499 && !var10.field2652) {
                     class64.field790 = var0;
                     class15.field303 = var6;
                     class71.field847 = var7;
                     continue;
                  }

                  if(Client.field1090 && Client.field1084) {
                     var15 = class59.field730;
                     var16 = class59.field731;
                     var15 -= Client.field1081;
                     var16 -= Client.field1082;
                     if(var15 < Client.field1093) {
                        var15 = Client.field1093;
                     }

                     if(var15 + var10.width > Client.field1093 + Client.field1080.width) {
                        var15 = Client.field1093 + Client.field1080.width - var10.width;
                     }

                     if(var16 < Client.field1086) {
                        var16 = Client.field1086;
                     }

                     if(var16 + var10.height > Client.field1086 + Client.field1080.height) {
                        var16 = Client.field1086 + Client.field1080.height - var10.height;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if(!var10.field2652) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var10.type == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if(var10.type == 9) {
                  var22 = var12;
                  var19 = var13;
                  var20 = var12 + var10.width;
                  var21 = var13 + var10.height;
                  if(var20 < var12) {
                     var22 = var20;
                     var20 = var12;
                  }

                  if(var21 < var13) {
                     var19 = var21;
                     var21 = var13;
                  }

                  ++var20;
                  ++var21;
                  var15 = var22 > var2?var22:var2;
                  var16 = var19 > var3?var19:var3;
                  var17 = var20 < var4?var20:var4;
                  var18 = var21 < var5?var21:var5;
               } else {
                  var22 = var12 + var10.width;
                  var19 = var13 + var10.height;
                  var15 = var12 > var2?var12:var2;
                  var16 = var13 > var3?var13:var3;
                  var17 = var22 < var4?var22:var4;
                  var18 = var19 < var5?var19:var5;
               }

               if(!var10.hasScript || var15 < var17 && var16 < var18) {
                  if(var10.contentType != 0) {
                     if(var10.contentType == 1336) {
                        if(Client.field918) {
                           var13 += 15;
                           WallObject.font_p12full.method4680("Fps:" + GameEngine.FPS, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var36 = Runtime.getRuntime();
                           var19 = (int)((var36.totalMemory() - var36.freeMemory()) / 1024L);
                           var20 = 16776960;
                           if(var19 > '耀' && Client.field1055) {
                              var20 = 16711680;
                           }

                           if(var19 > 65536 && !Client.field1055) {
                              var20 = 16711680;
                           }

                           WallObject.font_p12full.method4680("Mem:" + var19 + "k", var12 + var10.width, var13, var20, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if(var10.contentType == 1337) {
                        Client.field941 = var12;
                        Client.field1056 = var13;
                        class21.method173(var12, var13, var10.width, var10.height);
                        Client.field1111[var10.boundsIndex] = true;
                        Rasterizer2D.method4833(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.contentType == 1338) {
                        class276.method4796(var10, var12, var13, var11);
                        Rasterizer2D.method4833(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.contentType == 1339) {
                        class11.method62(var10, var12, var13, var11);
                        Rasterizer2D.method4833(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.contentType == 1400) {
                        class46.renderOverview.extractWorldmap(var12, var13, var10.width, var10.height, Client.gameCycle);
                     }

                     if(var10.contentType == 1401) {
                        class46.renderOverview.extractData(var12, var13, var10.width, var10.height);
                     }
                  }

                  if(var10.type == 0) {
                     if(!var10.hasScript && WorldMapType2.method510(var10) && var10 != Item.field1476) {
                        continue;
                     }

                     if(!var10.hasScript) {
                        if(var10.scrollY > var10.scrollHeight - var10.height) {
                           var10.scrollY = var10.scrollHeight - var10.height;
                        }

                        if(var10.scrollY < 0) {
                           var10.scrollY = 0;
                        }
                     }

                     gameDraw(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     if(var10.children != null) {
                        gameDraw(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     WidgetNode var23 = (WidgetNode)Client.componentTable.method3425((long)var10.id);
                     if(var23 != null) {
                        class158.drawWidget(var23.id, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.method4833(var2, var3, var4, var5);
                     class136.method2493();
                  }

                  if(Client.isResized || Client.field1128[var11] || Client.gameDrawingMode > 1) {
                     int var24;
                     int var34;
                     if(var10.type == 0 && !var10.hasScript && var10.scrollHeight > var10.height) {
                        var22 = var12 + var10.width;
                        var19 = var10.scrollY;
                        var20 = var10.height;
                        var21 = var10.scrollHeight;
                        class1.field13[0].method4923(var22, var13);
                        class1.field13[1].method4923(var22, var13 + var20 - 16);
                        Rasterizer2D.method4826(var22, var13 + 16, 16, var20 - 32, Client.field983);
                        var24 = (var20 - 32) * var20 / var21;
                        if(var24 < 8) {
                           var24 = 8;
                        }

                        var34 = (var20 - 32 - var24) * var19 / (var21 - var20);
                        Rasterizer2D.method4826(var22, var13 + 16 + var34, 16, var24, Client.field984);
                        Rasterizer2D.method4836(var22, var13 + var34 + 16, var24, Client.field986);
                        Rasterizer2D.method4836(var22 + 1, var13 + 16 + var34, var24, Client.field986);
                        Rasterizer2D.method4834(var22, var13 + 16 + var34, 16, Client.field986);
                        Rasterizer2D.method4834(var22, var13 + var34 + 17, 16, Client.field986);
                        Rasterizer2D.method4836(var22 + 15, var13 + var34 + 16, var24, Client.field1184);
                        Rasterizer2D.method4836(var22 + 14, var13 + var34 + 17, var24 - 1, Client.field1184);
                        Rasterizer2D.method4834(var22, var34 + var24 + var13 + 15, 16, Client.field1184);
                        Rasterizer2D.method4834(var22 + 1, var24 + var13 + 14 + var34, 15, Client.field1184);
                     }

                     if(var10.type != 1) {
                        int var25;
                        int var26;
                        SpritePixels var39;
                        if(var10.type == 2) {
                           var22 = 0;

                           for(var19 = 0; var19 < var10.field2666; ++var19) {
                              for(var20 = 0; var20 < var10.originalWidth; ++var20) {
                                 var21 = (var10.paddingX + 32) * var20 + var12;
                                 var24 = var13 + (var10.paddingY + 32) * var19;
                                 if(var22 < 20) {
                                    var21 += var10.field2722[var22];
                                    var24 += var10.field2723[var22];
                                 }

                                 if(var10.itemIds[var22] <= 0) {
                                    if(var10.field2724 != null && var22 < 20) {
                                       SpritePixels var37 = var10.method3880(var22);
                                       if(var37 != null) {
                                          var37.method4950(var21, var24);
                                       } else if(Widget.field2651) {
                                          XItemContainer.method1020(var10);
                                       }
                                    }
                                 } else {
                                    boolean var35 = false;
                                    boolean var38 = false;
                                    var26 = var10.itemIds[var22] - 1;
                                    if(var21 + 32 > var2 && var21 < var4 && var24 + 32 > var3 && var24 < var5 || var10 == class165.field2335 && var22 == Client.field1019) {
                                       if(Client.itemSelectionState == 1 && var22 == class91.selectedItemIndex && class33.field480 == var10.id) {
                                          var39 = class6.createSprite(var26, var10.itemQuantities[var22], 2, 0, 2, false);
                                       } else {
                                          var39 = class6.createSprite(var26, var10.itemQuantities[var22], 1, 3153952, 2, false);
                                       }

                                       if(var39 != null) {
                                          if(var10 == class165.field2335 && var22 == Client.field1019) {
                                             var34 = class59.field730 - Client.field911;
                                             var25 = class59.field731 - Client.field985;
                                             if(var34 < 5 && var34 > -5) {
                                                var34 = 0;
                                             }

                                             if(var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if(Client.field1024 < 5) {
                                                var34 = 0;
                                                var25 = 0;
                                             }

                                             var39.method4955(var34 + var21, var24 + var25, 128);
                                             if(var1 != -1) {
                                                Widget var42 = var0[var1 & '\uffff'];
                                                int var46;
                                                if(var24 + var25 < Rasterizer2D.drawingAreaTop && var42.scrollY > 0) {
                                                   var46 = (Rasterizer2D.drawingAreaTop - var24 - var25) * Client.field1125 / 3;
                                                   if(var46 > Client.field1125 * 10) {
                                                      var46 = Client.field1125 * 10;
                                                   }

                                                   if(var46 > var42.scrollY) {
                                                      var46 = var42.scrollY;
                                                   }

                                                   var42.scrollY -= var46;
                                                   Client.field985 += var46;
                                                   XItemContainer.method1020(var42);
                                                }

                                                if(var24 + var25 + 32 > Rasterizer2D.drawingAreaRight && var42.scrollY < var42.scrollHeight - var42.height) {
                                                   var46 = (var25 + var24 + 32 - Rasterizer2D.drawingAreaRight) * Client.field1125 / 3;
                                                   if(var46 > Client.field1125 * 10) {
                                                      var46 = Client.field1125 * 10;
                                                   }

                                                   if(var46 > var42.scrollHeight - var42.height - var42.scrollY) {
                                                      var46 = var42.scrollHeight - var42.height - var42.scrollY;
                                                   }

                                                   var42.scrollY += var46;
                                                   Client.field985 -= var46;
                                                   XItemContainer.method1020(var42);
                                                }
                                             }
                                          } else if(var10 == class59.field735 && var22 == Client.field1018) {
                                             var39.method4955(var21, var24, 128);
                                          } else {
                                             var39.method4950(var21, var24);
                                          }
                                       } else {
                                          XItemContainer.method1020(var10);
                                       }
                                    }
                                 }

                                 ++var22;
                              }
                           }
                        } else if(var10.type == 3) {
                           if(class54.method746(var10)) {
                              var22 = var10.field2728;
                              if(var10 == Item.field1476 && var10.field2682 != 0) {
                                 var22 = var10.field2682;
                              }
                           } else {
                              var22 = var10.textColor;
                              if(var10 == Item.field1476 && var10.field2681 != 0) {
                                 var22 = var10.field2681;
                              }
                           }

                           if(var10.field2683) {
                              switch(var10.field2684.field3768) {
                              case 1:
                                 Rasterizer2D.method4822(var12, var13, var10.width, var10.height, var10.textColor, var10.field2728, 256 - (var10.opacity & 255), 256 - (var10.field2686 & 255));
                                 break;
                              case 2:
                                 Rasterizer2D.method4874(var12, var13, var10.width, var10.height, var10.textColor, var10.field2728, 256 - (var10.opacity & 255), 256 - (var10.field2686 & 255));
                                 break;
                              case 3:
                                 Rasterizer2D.method4818(var12, var13, var10.width, var10.height, var10.textColor, var10.field2728, 256 - (var10.opacity & 255), 256 - (var10.field2686 & 255));
                                 break;
                              case 4:
                                 Rasterizer2D.method4819(var12, var13, var10.width, var10.height, var10.textColor, var10.field2728, 256 - (var10.opacity & 255), 256 - (var10.field2686 & 255));
                                 break;
                              default:
                                 if(var14 == 0) {
                                    Rasterizer2D.method4826(var12, var13, var10.width, var10.height, var22);
                                 } else {
                                    Rasterizer2D.method4825(var12, var13, var10.width, var10.height, var22, 256 - (var14 & 255));
                                 }
                              }
                           } else if(var14 == 0) {
                              Rasterizer2D.method4888(var12, var13, var10.width, var10.height, var22);
                           } else {
                              Rasterizer2D.method4841(var12, var13, var10.width, var10.height, var22, 256 - (var14 & 255));
                           }
                        } else {
                           Font var27;
                           String var28;
                           if(var10.type == 4) {
                              var27 = var10.method3918();
                              if(var27 == null) {
                                 if(Widget.field2651) {
                                    XItemContainer.method1020(var10);
                                 }
                              } else {
                                 String var43 = var10.text;
                                 if(class54.method746(var10)) {
                                    var19 = var10.field2728;
                                    if(var10 == Item.field1476 && var10.field2682 != 0) {
                                       var19 = var10.field2682;
                                    }

                                    if(var10.field2715.length() > 0) {
                                       var43 = var10.field2715;
                                    }
                                 } else {
                                    var19 = var10.textColor;
                                    if(var10 == Item.field1476 && var10.field2681 != 0) {
                                       var19 = var10.field2681;
                                    }
                                 }

                                 if(var10.hasScript && var10.itemId != -1) {
                                    ItemComposition var41 = class224.getItemDefinition(var10.itemId);
                                    var43 = var41.name;
                                    if(var43 == null) {
                                       var43 = "null";
                                    }

                                    if((var41.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                       var43 = class15.method105(16748608) + var43 + "</col> " + 'x' + class98.method1748(var10.itemQuantity);
                                    }
                                 }

                                 if(var10 == Client.field1070) {
                                    var28 = null;
                                    var43 = "Please wait...";
                                    var19 = var10.textColor;
                                 }

                                 if(!var10.hasScript) {
                                    var43 = class59.method959(var43, var10);
                                 }

                                 var27.method4636(var43, var12, var13, var10.width, var10.height, var19, var10.field2736?0:-1, var10.field2696, var10.field2718, var10.field2680);
                              }
                           } else if(var10.type == 5) {
                              if(!var10.hasScript) {
                                 var39 = var10.method3885(class54.method746(var10));
                                 if(var39 != null) {
                                    var39.method4950(var12, var13);
                                 } else if(Widget.field2651) {
                                    XItemContainer.method1020(var10);
                                 }
                              } else {
                                 if(var10.itemId != -1) {
                                    var39 = class6.createSprite(var10.itemId, var10.itemQuantity, var10.borderThickness, var10.sprite2, var10.field2712, false);
                                 } else {
                                    var39 = var10.method3885(false);
                                 }

                                 if(var39 == null) {
                                    if(Widget.field2651) {
                                       XItemContainer.method1020(var10);
                                    }
                                 } else {
                                    var19 = var39.maxWidth;
                                    var20 = var39.maxHeight;
                                    if(!var10.field2692) {
                                       var21 = var10.width * 4096 / var19;
                                       if(var10.field2691 != 0) {
                                          var39.method4952(var10.width / 2 + var12, var10.height / 2 + var13, var10.field2691, var21);
                                       } else if(var14 != 0) {
                                          var39.method4999(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if(var19 == var10.width && var20 == var10.height) {
                                          var39.method4950(var12, var13);
                                       } else {
                                          var39.method4963(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.method4862(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var21 = (var19 - 1 + var10.width) / var19;
                                       var24 = (var20 - 1 + var10.height) / var20;

                                       for(var34 = 0; var34 < var21; ++var34) {
                                          for(var25 = 0; var25 < var24; ++var25) {
                                             if(var10.field2691 != 0) {
                                                var39.method4952(var19 / 2 + var12 + var34 * var19, var20 / 2 + var25 * var20 + var13, var10.field2691, 4096);
                                             } else if(var14 != 0) {
                                                var39.method4955(var12 + var19 * var34, var13 + var20 * var25, 256 - (var14 & 255));
                                             } else {
                                                var39.method4950(var12 + var34 * var19, var13 + var25 * var20);
                                             }
                                          }
                                       }

                                       Rasterizer2D.method4833(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ItemComposition var29;
                              if(var10.type == 6) {
                                 boolean var40 = class54.method746(var10);
                                 if(var40) {
                                    var19 = var10.field2702;
                                 } else {
                                    var19 = var10.field2777;
                                 }

                                 Model var44 = null;
                                 var21 = 0;
                                 if(var10.itemId != -1) {
                                    var29 = class224.getItemDefinition(var10.itemId);
                                    if(var29 != null) {
                                       var29 = var29.method4458(var10.itemQuantity);
                                       var44 = var29.getModel(1);
                                       if(var44 != null) {
                                          var44.method2397();
                                          var21 = var44.modelHeight / 2;
                                       } else {
                                          XItemContainer.method1020(var10);
                                       }
                                    }
                                 } else if(var10.modelType == 5) {
                                    if(var10.modelId == 0) {
                                       var44 = Client.field1177.method3845((Sequence)null, -1, (Sequence)null, -1);
                                    } else {
                                       var44 = class20.localPlayer.getModel();
                                    }
                                 } else if(var19 == -1) {
                                    var44 = var10.method3914((Sequence)null, -1, var40, class20.localPlayer.composition);
                                    if(var44 == null && Widget.field2651) {
                                       XItemContainer.method1020(var10);
                                    }
                                 } else {
                                    Sequence var45 = GameEngine.getAnimation(var19);
                                    var44 = var10.method3914(var45, var10.field2776, var40, class20.localPlayer.composition);
                                    if(var44 == null && Widget.field2651) {
                                       XItemContainer.method1020(var10);
                                    }
                                 }

                                 class136.method2545(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var24 = class136.SINE[var10.rotationX] * var10.field2737 >> 16;
                                 var34 = class136.COSINE[var10.rotationX] * var10.field2737 >> 16;
                                 if(var44 != null) {
                                    if(!var10.hasScript) {
                                       var44.method2440(0, var10.rotationZ, 0, var10.rotationX, 0, var24, var34);
                                    } else {
                                       var44.method2397();
                                       if(var10.field2711) {
                                          var44.method2411(0, var10.rotationZ, var10.rotationY, var10.rotationX, var10.field2750, var24 + var21 + var10.field2731, var34 + var10.field2731, var10.field2737);
                                       } else {
                                          var44.method2440(0, var10.rotationZ, var10.rotationY, var10.rotationX, var10.field2750, var24 + var21 + var10.field2731, var34 + var10.field2731);
                                       }
                                    }
                                 }

                                 class136.method2549();
                              } else {
                                 if(var10.type == 7) {
                                    var27 = var10.method3918();
                                    if(var27 == null) {
                                       if(Widget.field2651) {
                                          XItemContainer.method1020(var10);
                                       }
                                       continue;
                                    }

                                    var19 = 0;

                                    for(var20 = 0; var20 < var10.field2666; ++var20) {
                                       for(var21 = 0; var21 < var10.originalWidth; ++var21) {
                                          if(var10.itemIds[var19] > 0) {
                                             var29 = class224.getItemDefinition(var10.itemIds[var19] - 1);
                                             if(var29.isStackable != 1 && var10.itemQuantities[var19] == 1) {
                                                var28 = class15.method105(16748608) + var29.name + "</col>";
                                             } else {
                                                var28 = class15.method105(16748608) + var29.name + "</col> " + 'x' + class98.method1748(var10.itemQuantities[var19]);
                                             }

                                             var25 = var12 + (var10.paddingX + 115) * var21;
                                             var26 = var13 + var20 * (var10.paddingY + 12);
                                             if(var10.field2696 == 0) {
                                                var27.method4647(var28, var25, var26, var10.textColor, var10.field2736?0:-1);
                                             } else if(var10.field2696 == 1) {
                                                var27.method4635(var28, var10.width / 2 + var25, var26, var10.textColor, var10.field2736?0:-1);
                                             } else {
                                                var27.method4680(var28, var25 + var10.width - 1, var26, var10.textColor, var10.field2736?0:-1);
                                             }
                                          }

                                          ++var19;
                                       }
                                    }
                                 }

                                 if(var10.type == 8 && var10 == class12.field280 && Client.field917 == Client.field1058) {
                                    var22 = 0;
                                    var19 = 0;
                                    Font var30 = WallObject.font_p12full;
                                    String var31 = var10.text;

                                    String var32;
                                    for(var31 = class59.method959(var31, var10); var31.length() > 0; var19 += var30.field3643 + 1) {
                                       var34 = var31.indexOf("<br>");
                                       if(var34 != -1) {
                                          var32 = var31.substring(0, var34);
                                          var31 = var31.substring(var34 + 4);
                                       } else {
                                          var32 = var31;
                                          var31 = "";
                                       }

                                       var25 = var30.method4696(var32);
                                       if(var25 > var22) {
                                          var22 = var25;
                                       }
                                    }

                                    var22 += 6;
                                    var19 += 7;
                                    var34 = var12 + var10.width - 5 - var22;
                                    var25 = var13 + var10.height + 5;
                                    if(var34 < var12 + 5) {
                                       var34 = var12 + 5;
                                    }

                                    if(var22 + var34 > var4) {
                                       var34 = var4 - var22;
                                    }

                                    if(var19 + var25 > var5) {
                                       var25 = var5 - var19;
                                    }

                                    Rasterizer2D.method4826(var34, var25, var22, var19, 16777120);
                                    Rasterizer2D.method4888(var34, var25, var22, var19, 0);
                                    var31 = var10.text;
                                    var26 = var25 + var30.field3643 + 2;

                                    for(var31 = class59.method959(var31, var10); var31.length() > 0; var26 += var30.field3643 + 1) {
                                       int var33 = var31.indexOf("<br>");
                                       if(var33 != -1) {
                                          var32 = var31.substring(0, var33);
                                          var31 = var31.substring(var33 + 4);
                                       } else {
                                          var32 = var31;
                                          var31 = "";
                                       }

                                       var30.method4647(var32, var34 + 3, var26, 0, -1);
                                    }
                                 }

                                 if(var10.type == 9) {
                                    if(var10.field2688) {
                                       var22 = var12;
                                       var19 = var13 + var10.height;
                                       var20 = var12 + var10.width;
                                       var21 = var13;
                                    } else {
                                       var22 = var12;
                                       var19 = var13;
                                       var20 = var12 + var10.width;
                                       var21 = var13 + var10.height;
                                    }

                                    if(var10.field2687 == 1) {
                                       Rasterizer2D.method4838(var22, var19, var20, var21, var10.textColor);
                                    } else {
                                       class22.method185(var22, var19, var20, var21, var10.textColor, var10.field2687);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)LObjectComposition;",
      garbageValue = "69405308"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.field3489.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.field3444.getConfigData(6, var0);
         var1 = new ObjectComposition();
         var1.field3461 = var0;
         if(var2 != null) {
            var1.method4389(new Buffer(var2));
         }

         var1.method4388();
         if(var1.isSolid) {
            var1.field3476 = 0;
            var1.field3468 = false;
         }

         ObjectComposition.field3489.put(var1, (long)var0);
         return var1;
      }
   }

   class29(class41 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(LPacketBuffer;IS)Z",
      garbageValue = "18229"
   )
   static boolean method253(PacketBuffer var0, int var1) {
      int var2 = var0.method3290(2);
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if(var2 == 0) {
         if(var0.method3290(1) != 0) {
            method253(var0, var1);
         }

         var3 = var0.method3290(13);
         var4 = var0.method3290(13);
         boolean var11 = var0.method3290(1) == 1;
         if(var11) {
            class96.field1500[++class96.field1493 - 1] = var1;
         }

         if(Client.cachedPlayers[var1] != null) {
            throw new RuntimeException();
         } else {
            Player var12 = Client.cachedPlayers[var1] = new Player();
            var12.field890 = var1;
            if(class96.field1498[var1] != null) {
               var12.method1091(class96.field1498[var1]);
            }

            var12.orientation = class96.field1497[var1];
            var12.interacting = class96.field1492[var1];
            var5 = class96.field1490[var1];
            var6 = var5 >> 28;
            var7 = var5 >> 14 & 255;
            var8 = var5 & 255;
            var12.field1265[0] = class96.field1494[var1];
            var12.field884 = (byte)var6;
            var12.method1083(var3 + (var7 << 13) - class19.baseX, var4 + (var8 << 13) - class21.baseY);
            var12.field877 = false;
            return true;
         }
      } else if(var2 == 1) {
         var3 = var0.method3290(2);
         var4 = class96.field1490[var1];
         class96.field1490[var1] = ((var3 + (var4 >> 28) & 3) << 28) + (var4 & 268435455);
         return false;
      } else {
         int var9;
         int var10;
         if(var2 == 2) {
            var3 = var0.method3290(5);
            var4 = var3 >> 3;
            var9 = var3 & 7;
            var10 = class96.field1490[var1];
            var5 = var4 + (var10 >> 28) & 3;
            var6 = var10 >> 14 & 255;
            var7 = var10 & 255;
            if(var9 == 0) {
               --var6;
               --var7;
            }

            if(var9 == 1) {
               --var7;
            }

            if(var9 == 2) {
               ++var6;
               --var7;
            }

            if(var9 == 3) {
               --var6;
            }

            if(var9 == 4) {
               ++var6;
            }

            if(var9 == 5) {
               --var6;
               ++var7;
            }

            if(var9 == 6) {
               ++var7;
            }

            if(var9 == 7) {
               ++var6;
               ++var7;
            }

            class96.field1490[var1] = (var5 << 28) + var7 + (var6 << 14);
            return false;
         } else {
            var3 = var0.method3290(18);
            var4 = var3 >> 16;
            var9 = var3 >> 8 & 255;
            var10 = var3 & 255;
            var5 = class96.field1490[var1];
            var6 = var4 + (var5 >> 28) & 3;
            var7 = (var5 >> 14) + var9 & 255;
            var8 = var5 + var10 & 255;
            class96.field1490[var1] = (var7 << 14) + var8 + (var6 << 28);
            return false;
         }
      }
   }
}
