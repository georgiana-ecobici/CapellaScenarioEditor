package org.polarsys.capella.scenario.editor.dslscenario.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scenario'", "'{'", "'}'", "'System'", "'IS'", "'ES'", "'Logical'", "'Physical'", "'FS'", "'EPBS'", "'OAS'", "'OES'", "'actor'", "'as'", "'component'", "'unset'", "'behavior'", "'node'", "'configuration_item'", "'function'", "'activity'", "'entity'", "'role'", "'->'", "':'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_scenarioType_1_0 = null;

        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalDsl.g:79:3: otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getScenarioKeyword_0());
            		
            // InternalDsl.g:83:3: ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) )
            // InternalDsl.g:84:4: (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants )
            {
            // InternalDsl.g:84:4: (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants )
            // InternalDsl.g:85:5: lv_scenarioType_1_0= ruleScenarioTypeAndParticipants
            {

            					newCompositeNode(grammarAccess.getModelAccess().getScenarioTypeScenarioTypeAndParticipantsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_scenarioType_1_0=ruleScenarioTypeAndParticipants();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"scenarioType",
            						lv_scenarioType_1_0,
            						"org.polarsys.capella.scenario.editor.dslscenario.Dsl.ScenarioTypeAndParticipants");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:106:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:107:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalDsl.g:107:4: (lv_messages_3_0= ruleMessage )
            	    // InternalDsl.g:108:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_messages_3_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_3_0,
            	    						"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenarioTypeAndParticipants"
    // InternalDsl.g:133:1: entryRuleScenarioTypeAndParticipants returns [EObject current=null] : iv_ruleScenarioTypeAndParticipants= ruleScenarioTypeAndParticipants EOF ;
    public final EObject entryRuleScenarioTypeAndParticipants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioTypeAndParticipants = null;


        try {
            // InternalDsl.g:133:68: (iv_ruleScenarioTypeAndParticipants= ruleScenarioTypeAndParticipants EOF )
            // InternalDsl.g:134:2: iv_ruleScenarioTypeAndParticipants= ruleScenarioTypeAndParticipants EOF
            {
             newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioTypeAndParticipants=ruleScenarioTypeAndParticipants();

            state._fsp--;

             current =iv_ruleScenarioTypeAndParticipants; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioTypeAndParticipants"


    // $ANTLR start "ruleScenarioTypeAndParticipants"
    // InternalDsl.g:140:1: ruleScenarioTypeAndParticipants returns [EObject current=null] : ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* ) | (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* ) | (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* ) | (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* ) | (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* ) | (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* ) ) ;
    public final EObject ruleScenarioTypeAndParticipants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_name_19_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_name_23_0=null;
        Token otherlv_25=null;
        Token lv_name_26_0=null;
        Token otherlv_28=null;
        Token lv_name_29_0=null;
        EObject lv_participants_4_0 = null;

        EObject lv_participants_9_1 = null;

        EObject lv_participants_9_2 = null;

        EObject lv_participant_14_1 = null;

        EObject lv_participant_14_2 = null;

        EObject lv_participants_20_0 = null;

        EObject lv_participants_24_0 = null;

        EObject lv_participants_27_0 = null;

        EObject lv_participants_30_1 = null;

        EObject lv_participants_30_2 = null;

        EObject lv_participants_30_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:146:2: ( ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* ) | (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* ) | (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* ) | (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* ) | (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* ) | (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* ) ) )
            // InternalDsl.g:147:2: ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* ) | (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* ) | (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* ) | (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* ) | (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* ) | (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* ) )
            {
            // InternalDsl.g:147:2: ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* ) | (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* ) | (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* ) | (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* ) | (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* ) | (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* ) )
            int alt16=7;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:148:3: (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* )
                    {
                    // InternalDsl.g:148:3: (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* )
                    // InternalDsl.g:149:4: otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )*
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_0_0());
                    			
                    // InternalDsl.g:153:4: (otherlv_1= 'IS' | otherlv_2= 'ES' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==15) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==16) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDsl.g:154:5: otherlv_1= 'IS'
                            {
                            otherlv_1=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_1, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:159:5: otherlv_2= 'ES'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_7); 

                            					newLeafNode(otherlv_2, grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:164:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalDsl.g:165:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:165:5: (lv_name_3_0= RULE_STRING )
                    // InternalDsl.g:166:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:182:4: ( (lv_participants_4_0= ruleActor ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==23) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:183:5: (lv_participants_4_0= ruleActor )
                    	    {
                    	    // InternalDsl.g:183:5: (lv_participants_4_0= ruleActor )
                    	    // InternalDsl.g:184:6: lv_participants_4_0= ruleActor
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_0_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_participants_4_0=ruleActor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_4_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:203:3: (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* )
                    {
                    // InternalDsl.g:203:3: (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* )
                    // InternalDsl.g:204:4: otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )*
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_1_0());
                    			
                    // InternalDsl.g:208:4: (otherlv_6= 'IS' | otherlv_7= 'ES' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==16) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDsl.g:209:5: otherlv_6= 'IS'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_6, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:214:5: otherlv_7= 'ES'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:219:4: ( (lv_name_8_0= RULE_STRING ) )
                    // InternalDsl.g:220:5: (lv_name_8_0= RULE_STRING )
                    {
                    // InternalDsl.g:220:5: (lv_name_8_0= RULE_STRING )
                    // InternalDsl.g:221:6: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:237:4: ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23||LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDsl.g:238:5: ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) )
                    	    {
                    	    // InternalDsl.g:238:5: ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) )
                    	    // InternalDsl.g:239:6: (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent )
                    	    {
                    	    // InternalDsl.g:239:6: (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent )
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==23) ) {
                    	        alt5=1;
                    	    }
                    	    else if ( (LA5_0==25) ) {
                    	        alt5=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 5, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // InternalDsl.g:240:7: lv_participants_9_1= ruleActor
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_1_3_0_0());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participants_9_1=ruleActor();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_9_1,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:256:7: lv_participants_9_2= ruleComponent
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsComponentParserRuleCall_1_3_0_1());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participants_9_2=ruleComponent();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_9_2,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Component");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:276:3: (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* )
                    {
                    // InternalDsl.g:276:3: (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* )
                    // InternalDsl.g:277:4: otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )*
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_2_0());
                    			
                    // InternalDsl.g:281:4: (otherlv_11= 'IS' | otherlv_12= 'ES' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==16) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDsl.g:282:5: otherlv_11= 'IS'
                            {
                            otherlv_11=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_11, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:287:5: otherlv_12= 'ES'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_7); 

                            					newLeafNode(otherlv_12, grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:292:4: ( (lv_name_13_0= RULE_STRING ) )
                    // InternalDsl.g:293:5: (lv_name_13_0= RULE_STRING )
                    {
                    // InternalDsl.g:293:5: (lv_name_13_0= RULE_STRING )
                    // InternalDsl.g:294:6: lv_name_13_0= RULE_STRING
                    {
                    lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_name_13_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:310:4: ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23||LA9_0==25) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDsl.g:311:5: ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) )
                    	    {
                    	    // InternalDsl.g:311:5: ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) )
                    	    // InternalDsl.g:312:6: (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent )
                    	    {
                    	    // InternalDsl.g:312:6: (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent )
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==23) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==25) ) {
                    	        alt8=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 8, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // InternalDsl.g:313:7: lv_participant_14_1= ruleActor
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantActorParserRuleCall_2_3_0_0());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participant_14_1=ruleActor();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participant",
                    	            								lv_participant_14_1,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:329:7: lv_participant_14_2= rulePhysicalComponent
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantPhysicalComponentParserRuleCall_2_3_0_1());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participant_14_2=rulePhysicalComponent();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participant",
                    	            								lv_participant_14_2,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.PhysicalComponent");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:349:3: ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* )
                    {
                    // InternalDsl.g:349:3: ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* )
                    // InternalDsl.g:350:4: (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )*
                    {
                    // InternalDsl.g:350:4: (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt10=1;
                        }
                        break;
                    case 17:
                        {
                        alt10=2;
                        }
                        break;
                    case 18:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // InternalDsl.g:351:5: otherlv_15= 'System'
                            {
                            otherlv_15=(Token)match(input,14,FOLLOW_10); 

                            					newLeafNode(otherlv_15, grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:356:5: otherlv_16= 'Logical'
                            {
                            otherlv_16=(Token)match(input,17,FOLLOW_10); 

                            					newLeafNode(otherlv_16, grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_3_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDsl.g:361:5: otherlv_17= 'Physical'
                            {
                            otherlv_17=(Token)match(input,18,FOLLOW_10); 

                            					newLeafNode(otherlv_17, grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_3_0_2());
                            				

                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_18, grammarAccess.getScenarioTypeAndParticipantsAccess().getFSKeyword_3_1());
                    			
                    // InternalDsl.g:370:4: ( (lv_name_19_0= RULE_STRING ) )
                    // InternalDsl.g:371:5: (lv_name_19_0= RULE_STRING )
                    {
                    // InternalDsl.g:371:5: (lv_name_19_0= RULE_STRING )
                    // InternalDsl.g:372:6: lv_name_19_0= RULE_STRING
                    {
                    lv_name_19_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_name_19_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_19_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:388:4: ( (lv_participants_20_0= ruleFunction ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==30) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:389:5: (lv_participants_20_0= ruleFunction )
                    	    {
                    	    // InternalDsl.g:389:5: (lv_participants_20_0= ruleFunction )
                    	    // InternalDsl.g:390:6: lv_participants_20_0= ruleFunction
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsFunctionParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_participants_20_0=ruleFunction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_20_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Function");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:409:3: (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* )
                    {
                    // InternalDsl.g:409:3: (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* )
                    // InternalDsl.g:410:4: otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )*
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getScenarioTypeAndParticipantsAccess().getEPBSKeyword_4_0());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_4_1());
                    			
                    // InternalDsl.g:418:4: ( (lv_name_23_0= RULE_STRING ) )
                    // InternalDsl.g:419:5: (lv_name_23_0= RULE_STRING )
                    {
                    // InternalDsl.g:419:5: (lv_name_23_0= RULE_STRING )
                    // InternalDsl.g:420:6: lv_name_23_0= RULE_STRING
                    {
                    lv_name_23_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_name_23_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_23_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:436:4: ( (lv_participants_24_0= ruleConfigurationItem ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==29) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDsl.g:437:5: (lv_participants_24_0= ruleConfigurationItem )
                    	    {
                    	    // InternalDsl.g:437:5: (lv_participants_24_0= ruleConfigurationItem )
                    	    // InternalDsl.g:438:6: lv_participants_24_0= ruleConfigurationItem
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsConfigurationItemParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_participants_24_0=ruleConfigurationItem();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_24_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.ConfigurationItem");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:457:3: (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* )
                    {
                    // InternalDsl.g:457:3: (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* )
                    // InternalDsl.g:458:4: otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )*
                    {
                    otherlv_25=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getScenarioTypeAndParticipantsAccess().getOASKeyword_5_0());
                    			
                    // InternalDsl.g:462:4: ( (lv_name_26_0= RULE_STRING ) )
                    // InternalDsl.g:463:5: (lv_name_26_0= RULE_STRING )
                    {
                    // InternalDsl.g:463:5: (lv_name_26_0= RULE_STRING )
                    // InternalDsl.g:464:6: lv_name_26_0= RULE_STRING
                    {
                    lv_name_26_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_name_26_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_26_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:480:4: ( (lv_participants_27_0= ruleActivity ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==31) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:481:5: (lv_participants_27_0= ruleActivity )
                    	    {
                    	    // InternalDsl.g:481:5: (lv_participants_27_0= ruleActivity )
                    	    // InternalDsl.g:482:6: lv_participants_27_0= ruleActivity
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActivityParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_participants_27_0=ruleActivity();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_27_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Activity");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:501:3: (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* )
                    {
                    // InternalDsl.g:501:3: (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* )
                    // InternalDsl.g:502:4: otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )*
                    {
                    otherlv_28=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_28, grammarAccess.getScenarioTypeAndParticipantsAccess().getOESKeyword_6_0());
                    			
                    // InternalDsl.g:506:4: ( (lv_name_29_0= RULE_STRING ) )
                    // InternalDsl.g:507:5: (lv_name_29_0= RULE_STRING )
                    {
                    // InternalDsl.g:507:5: (lv_name_29_0= RULE_STRING )
                    // InternalDsl.g:508:6: lv_name_29_0= RULE_STRING
                    {
                    lv_name_29_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_name_29_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_29_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:524:4: ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==23||(LA15_0>=32 && LA15_0<=33)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDsl.g:525:5: ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) )
                    	    {
                    	    // InternalDsl.g:525:5: ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) )
                    	    // InternalDsl.g:526:6: (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole )
                    	    {
                    	    // InternalDsl.g:526:6: (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole )
                    	    int alt14=3;
                    	    switch ( input.LA(1) ) {
                    	    case 32:
                    	        {
                    	        alt14=1;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt14=2;
                    	        }
                    	        break;
                    	    case 33:
                    	        {
                    	        alt14=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalDsl.g:527:7: lv_participants_30_1= ruleEntity
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsEntityParserRuleCall_6_2_0_0());
                    	            						
                    	            pushFollow(FOLLOW_15);
                    	            lv_participants_30_1=ruleEntity();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_30_1,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Entity");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:543:7: lv_participants_30_2= ruleActor
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_6_2_0_1());
                    	            						
                    	            pushFollow(FOLLOW_15);
                    	            lv_participants_30_2=ruleActor();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_30_2,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalDsl.g:559:7: lv_participants_30_3= ruleRole
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsRoleParserRuleCall_6_2_0_2());
                    	            						
                    	            pushFollow(FOLLOW_15);
                    	            lv_participants_30_3=ruleRole();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_30_3,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Role");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioTypeAndParticipants"


    // $ANTLR start "entryRuleActor"
    // InternalDsl.g:582:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalDsl.g:582:46: (iv_ruleActor= ruleActor EOF )
            // InternalDsl.g:583:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalDsl.g:589:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:595:2: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:596:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:596:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:597:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalDsl.g:601:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:602:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:602:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:603:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getAsKeyword_2());
            		
            // InternalDsl.g:623:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:624:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:624:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:625:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:645:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDsl.g:645:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDsl.g:646:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:652:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:658:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:659:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:659:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:660:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalDsl.g:664:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:665:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:665:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:666:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getAsKeyword_2());
            		
            // InternalDsl.g:686:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:687:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:687:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:688:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePhysicalComponent"
    // InternalDsl.g:708:1: entryRulePhysicalComponent returns [EObject current=null] : iv_rulePhysicalComponent= rulePhysicalComponent EOF ;
    public final EObject entryRulePhysicalComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalComponent = null;


        try {
            // InternalDsl.g:708:58: (iv_rulePhysicalComponent= rulePhysicalComponent EOF )
            // InternalDsl.g:709:2: iv_rulePhysicalComponent= rulePhysicalComponent EOF
            {
             newCompositeNode(grammarAccess.getPhysicalComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicalComponent=rulePhysicalComponent();

            state._fsp--;

             current =iv_rulePhysicalComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhysicalComponent"


    // $ANTLR start "rulePhysicalComponent"
    // InternalDsl.g:715:1: rulePhysicalComponent returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? ) ;
    public final EObject rulePhysicalComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_component_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:721:2: ( ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? ) )
            // InternalDsl.g:722:2: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? )
            {
            // InternalDsl.g:722:2: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? )
            // InternalDsl.g:723:3: ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )?
            {
            // InternalDsl.g:723:3: ( (lv_component_0_0= ruleComponent ) )
            // InternalDsl.g:724:4: (lv_component_0_0= ruleComponent )
            {
            // InternalDsl.g:724:4: (lv_component_0_0= ruleComponent )
            // InternalDsl.g:725:5: lv_component_0_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_component_0_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicalComponentRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_0_0,
            						"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:742:3: (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )?
            int alt17=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt17=1;
                    }
                    break;
                case 27:
                    {
                    alt17=2;
                    }
                    break;
                case 28:
                    {
                    alt17=3;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // InternalDsl.g:743:4: otherlv_1= 'unset'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPhysicalComponentAccess().getUnsetKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:748:4: otherlv_2= 'behavior'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhysicalComponentAccess().getBehaviorKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDsl.g:753:4: otherlv_3= 'node'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPhysicalComponentAccess().getNodeKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhysicalComponent"


    // $ANTLR start "entryRuleConfigurationItem"
    // InternalDsl.g:762:1: entryRuleConfigurationItem returns [EObject current=null] : iv_ruleConfigurationItem= ruleConfigurationItem EOF ;
    public final EObject entryRuleConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationItem = null;


        try {
            // InternalDsl.g:762:58: (iv_ruleConfigurationItem= ruleConfigurationItem EOF )
            // InternalDsl.g:763:2: iv_ruleConfigurationItem= ruleConfigurationItem EOF
            {
             newCompositeNode(grammarAccess.getConfigurationItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationItem=ruleConfigurationItem();

            state._fsp--;

             current =iv_ruleConfigurationItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationItem"


    // $ANTLR start "ruleConfigurationItem"
    // InternalDsl.g:769:1: ruleConfigurationItem returns [EObject current=null] : (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleConfigurationItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:775:2: ( (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:776:2: (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:776:2: (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:777:3: otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0());
            		
            // InternalDsl.g:781:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:782:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:782:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:783:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationItemAccess().getAsKeyword_2());
            		
            // InternalDsl.g:803:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:804:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:804:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:805:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationItem"


    // $ANTLR start "entryRuleFunction"
    // InternalDsl.g:825:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalDsl.g:825:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalDsl.g:826:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDsl.g:832:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:838:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:839:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:839:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:840:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalDsl.g:844:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:845:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:845:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:846:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getAsKeyword_2());
            		
            // InternalDsl.g:866:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:867:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:867:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:868:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleActivity"
    // InternalDsl.g:888:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalDsl.g:888:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalDsl.g:889:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:895:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:901:2: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:902:2: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:902:2: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:903:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalDsl.g:907:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:908:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:908:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:909:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getAsKeyword_2());
            		
            // InternalDsl.g:929:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:930:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:930:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:931:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:951:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDsl.g:951:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDsl.g:952:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:958:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:964:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:965:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:965:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:966:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDsl.g:970:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:971:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:971:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:972:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getAsKeyword_2());
            		
            // InternalDsl.g:992:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:993:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:993:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:994:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:1014:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDsl.g:1014:45: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:1015:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:1021:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1027:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:1028:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:1028:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:1029:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalDsl.g:1033:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:1034:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:1034:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:1035:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getAsKeyword_2());
            		
            // InternalDsl.g:1055:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:1056:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:1056:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:1057:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMessage"
    // InternalDsl.g:1077:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalDsl.g:1077:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalDsl.g:1078:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalDsl.g:1084:1: ruleMessage returns [EObject current=null] : ( ( (lv_name1_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name1_0_0=null;
        Token otherlv_1=null;
        Token lv_name2_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1090:2: ( ( ( (lv_name1_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1091:2: ( ( (lv_name1_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1091:2: ( ( (lv_name1_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:1092:3: ( (lv_name1_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_name2_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:1092:3: ( (lv_name1_0_0= RULE_ID ) )
            // InternalDsl.g:1093:4: (lv_name1_0_0= RULE_ID )
            {
            // InternalDsl.g:1093:4: (lv_name1_0_0= RULE_ID )
            // InternalDsl.g:1094:5: lv_name1_0_0= RULE_ID
            {
            lv_name1_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name1_0_0, grammarAccess.getMessageAccess().getName1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name1",
            						lv_name1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalDsl.g:1114:3: ( (lv_name2_2_0= RULE_ID ) )
            // InternalDsl.g:1115:4: (lv_name2_2_0= RULE_ID )
            {
            // InternalDsl.g:1115:4: (lv_name2_2_0= RULE_ID )
            // InternalDsl.g:1116:5: lv_name2_2_0= RULE_ID
            {
            lv_name2_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name2_2_0, grammarAccess.getMessageAccess().getName2IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name2",
            						lv_name2_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1136:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:1137:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:1137:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:1138:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\16\3\17\7\uffff";
    static final String dfa_3s = "\1\26\3\23\7\uffff";
    static final String dfa_4s = "\4\uffff\1\5\1\6\1\7\1\1\1\4\1\2\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6",
            "\2\7\2\uffff\1\10",
            "\2\11\2\uffff\1\10",
            "\2\12\2\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "147:2: ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_participants_4_0= ruleActor ) )* ) | (otherlv_5= 'Logical' (otherlv_6= 'IS' | otherlv_7= 'ES' ) ( (lv_name_8_0= RULE_STRING ) ) ( ( (lv_participants_9_1= ruleActor | lv_participants_9_2= ruleComponent ) ) )* ) | (otherlv_10= 'Physical' (otherlv_11= 'IS' | otherlv_12= 'ES' ) ( (lv_name_13_0= RULE_STRING ) ) ( ( (lv_participant_14_1= ruleActor | lv_participant_14_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_15= 'System' | otherlv_16= 'Logical' | otherlv_17= 'Physical' ) otherlv_18= 'FS' ( (lv_name_19_0= RULE_STRING ) ) ( (lv_participants_20_0= ruleFunction ) )* ) | (otherlv_21= 'EPBS' otherlv_22= 'IS' ( (lv_name_23_0= RULE_STRING ) ) ( (lv_participants_24_0= ruleConfigurationItem ) )* ) | (otherlv_25= 'OAS' ( (lv_name_26_0= RULE_STRING ) ) ( (lv_participants_27_0= ruleActivity ) )* ) | (otherlv_28= 'OES' ( (lv_name_29_0= RULE_STRING ) ) ( ( (lv_participants_30_1= ruleEntity | lv_participants_30_2= ruleActor | lv_participants_30_3= ruleRole ) ) )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000764000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000300800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});

}